import java.util.Scanner;
public class Main {
    /**
     * Метод, считывающий необходимые данные для подсчета BWL (Ширины по ватерлинии)
     */
    public static void BWLinput(Yacht a, Scanner sc){
        System.out.println("Введите макимальную ширину яхты (BMAX): ");
        a.setBMAX(sc.nextDouble());
        System.out.println("Введите дельта B1");
        a.setdB1(sc.nextDouble());
        System.out.println("Введите дельта B2");
        a.setdB2(sc.nextDouble());
    }

    /**
     * Метод, считывающий необходимые данные для подсчета G
     */
    public static void Ginput(Yacht a, Scanner sc){
        System.out.println("Введите полный максимальный охват (при полностью опущенном шверте) (GMAX1): ");
        a.setGMAX1(sc.nextDouble());
        System.out.println("Шверт будет зафиксирован во время гонки? y/n");
        a.setTemp(sc.next());
        if (a.getTemp().equalsIgnoreCase("n")) {
            System.out.println("Введите охват при полностью поднятом шверте (GMAX2)");
            a.setGMAX2(sc.nextDouble());
        }

        System.out.println("Введите высоту надводного борта справа (FG1): ");
        a.setFG1(sc.nextDouble());
        System.out.println("Слева (FG2): ");
        a.setFG2(sc.nextDouble());
        System.out.println("У форштевня (FS): ");
        a.setFS(sc.nextDouble());
    }

    /**
     * Метод, считывающий необходимые данные для подсчета L (Обмерной длины яхты)
     */
    public static void Linput(Yacht a, Scanner sc) {
// L
        System.out.println("Введите полную длину корпуса яхты (LOA): ");
        a.setLOA(sc.nextDouble());
        System.out.println("Введите длину носового свеса (FGO): ");
        a.setFGO(sc.nextDouble());

        System.out.println("Вашая яхта имеет вогнутый кормовой подзор? y/n");
        a.setTemp(sc.next());
        if (a.getTemp().equalsIgnoreCase("y")){
            System.out.println("Введите высоту нижней точки транца над ватерлинией (HA): ");
            a.setHA(sc.nextDouble());
            if (a.getHA() > 0.03*(a.getBWL()+a.getG())) {
                System.out.println("Введите расстояние от задней точки яхты по ватерлинии до проекции на ватерлинию задней точки транца (OHAT): ");
                a.setOHAT(sc.nextDouble());
            }
            else {
                a.setAGO(0);
            }
        }
        else {
            System.out.println("Введите высоту заднего конца LOA над ватерлинией: ");
            double i = sc.nextDouble();
            if (i > 0.03*(a.getBWL()+a.getG())) {
                System.out.println("Введите длину кормового свеса: ");
                a.setAGO(sc.nextDouble());
            }
            else a.setAGO(0);
        }
    }

    /**
     * Метод, считывающий необходимые данные для подсчета SAM (Площади грота)
     */
    public static void SAMinput(Yacht a, Scanner sc){
//ГРОТ SAM
        System.out.println("Какой у вас грот?");
        System.out.println("1 - Бермудский грот");
        System.out.println("2 - Гафельный грот");
        a.setCave_Type(sc.nextDouble());
        if (a.getCave_Type() == 1) {
            System.out.println("Введите высоту подъема грота (Р): ");
            a.setP(sc.nextDouble());
            System.out.println("Введите длину нижней шкаторины грота (Е): ");
            a.setE(sc.nextDouble());
            System.out.println("Введите ширину вершины грота (HB): ");
            a.setHB(sc.nextDouble());
            System.out.println("Введите внутреннюю длину первого лат-кармана грота (BL1): ");
            a.setBL1(sc.nextDouble());
            System.out.println("Введите внутреннюю длину первого лат-кармана грота (BL2): ");
            a.setBL2(sc.nextDouble());
            System.out.println("Введите внутреннюю длину первого лат-кармана грота (BL3): ");
            a.setBL3(sc.nextDouble());
            System.out.println("Введите внутреннюю длину первого лат-кармана грота (BL4): ");
            a.setBL4(sc.nextDouble());
            System.out.println("Есть ещё лат-карманы? y/n");
            a.setTemp(sc.next());
            if (a.getTemp().equalsIgnoreCase("y")) {
                System.out.println("Введите сумму длин самых длинных карманов избыточных промежуточных лат грота (BL5). Если таковых нет, введите 0: ");
                a.setBL5(sc.nextDouble());
            }
            System.out.println("Введите ширину грота на трех четвертях высоты (MGU): ");
            a.setMGU(sc.nextDouble());
            System.out.println("Введите среднюю ширину грота (MGM): ");
            a.setMGM(sc.nextDouble());
        }
        else{
            System.out.println("Введите высоту подъема грота (H): ");
            a.setH(sc.nextDouble());
            System.out.println("Введите длину верхней шкаторины грота (GM): ");
            a.setGM(sc.nextDouble());
            System.out.println("Введите длину нижней шкаторины грота (Е): ");
            a.setE(sc.nextDouble());
            System.out.println("Введите длину передней шкаторины грот-топселя (TL): ");
            a.setTL(sc.nextDouble());
            System.out.println("Введите длину перпендикуляра передней шкаторины грот-топселя (TLP): ");
            a.setTLP(sc.nextDouble());
        }
    }


    /**
     * Метод, считывающий необходимые данные для подсчета SAG (Площади фока)
     */
    public static void SAGinput(Yacht a, Scanner sc){
//ФОК SAG
        System.out.println("Какой у вас фок?");
        System.out.println("1 - Бермудский фок");
        System.out.println("2 - Гафельный фок");
        a.setFok_type(sc.nextDouble());
        if (a.getFok_type() == 1) {
            System.out.println("Введите высоту подъема фока (PSF): ");
            a.setPSF(sc.nextDouble());
            System.out.println("Введите длину нижней шкаторины фока (EF): ");
            a.setEF(sc.nextDouble());
            System.out.println("Введите ширину вершины форка (HBF): ");
            a.setHBF(sc.nextDouble());

            System.out.println("Введите внутреннюю длину первого лат-кармана фока (BF1): ");
            a.setBF1(sc.nextDouble());
            System.out.println("Введите внутреннюю длину первого лат-кармана фока (BF2): ");
            a.setBF2(sc.nextDouble());
            System.out.println("Введите внутреннюю длину первого лат-кармана фока (BF3): ");
            a.setBF3(sc.nextDouble());
            System.out.println("Введите внутреннюю длину первого лат-кармана фока (BF4): ");
            a.setBF4(sc.nextDouble());
            System.out.println("Есть ещё лат-карманы? y/n");
            a.setTemp(sc.next());
            if (a.getTemp().equalsIgnoreCase("y")) {
                System.out.println("Введите сумму длин самых длинных карманов избыточных промежуточных лат фока (BF5). Если таковых нет, введите 0: ");
                a.setBF5(sc.nextDouble());
            }
            System.out.println("Введите ширину фока на трех четвертях высоты (GUF): ");
            a.setGUF(sc.nextDouble());
            System.out.println("Введите среднюю ширину фока (GMF): ");
            a.setGMF(sc.nextDouble());
        }
        else{
            System.out.println("Введите высоту подъема фока (HF): ");
            a.setHF(sc.nextDouble());
            System.out.println("Введите длину верхней шкаторины фока (GF): ");
            a.setGF(sc.nextDouble());
            System.out.println("Введите длину нижней шкаторины фока (EF): ");
            a.setEF(sc.nextDouble());
            System.out.println("Введите длину передней шкаторины фор-топселя (TFL): ");
            a.setTFL(sc.nextDouble());
            System.out.println("Введите длину перпендикуляра передней шкаторины фор-топсела (TFLP): ");
            a.setTFLP(sc.nextDouble());
        }
    }



    /**
     * Метод, считывающий необходимые данные для подсчета SAY (Площади бизани)
     */
    public static void SAYinput(Yacht a, Scanner sc){
//БИЗАНЬ SAY
        System.out.println("Какая у вас бизань?");
        System.out.println("1 - Бермудская бизань");
        System.out.println("2 - Гафельная бизань");
        a.setMizzen_type(sc.nextDouble());
        if (a.getMizzen_type() == 1) {
            System.out.println("Введите высоту подъема бизани (PY): ");
            a.setPY(sc.nextDouble());
            System.out.println("Введите длину нижней шкаторины бизани (EY): ");
            a.setEY(sc.nextDouble());
            System.out.println("Введите ширину вершины бизани (HBY): ");
            a.setHBY(sc.nextDouble());

            System.out.println("Введите внутреннюю длину первого лат-кармана бизани (BY1): ");
            a.setBY1(sc.nextDouble());
            System.out.println("Введите внутреннюю длину первого лат-кармана бизани (BY2): ");
            a.setBY2(sc.nextDouble());
            System.out.println("Введите внутреннюю длину первого лат-кармана бизани (BY3): ");
            a.setBY3(sc.nextDouble());
            System.out.println("Введите внутреннюю длину первого лат-кармана бизани (BY4): ");
            a.setBY4(sc.nextDouble());
            System.out.println("Есть ещё лат-карманы? y/n");
            a.setTemp(sc.next());
            if (a.getTemp().equalsIgnoreCase("y")) {
                System.out.println("Введите сумму длин самых длинных карманов избыточных промежуточных лат бизани (BY5)ю Если таковых нет, введите 0: ");
                a.setBY5(sc.nextDouble());
            }
            System.out.println("Введите ширину бизани на трех четвертях высоты (GUY): ");
            a.setGUY(sc.nextDouble());
            System.out.println("Введите среднюю ширину бизани (GMY): ");
            a.setGMY(sc.nextDouble());
        }
        else{
            System.out.println("Введите высоту подъема бизани (HY): ");
            a.setHY(sc.nextDouble());
            System.out.println("Введите длину верхней шкаторины бизани (GY): ");
            a.setGY(sc.nextDouble());
            System.out.println("Введите длину нижней шкаторины бизани (EY): ");
            a.setEY(sc.nextDouble());
            System.out.println("Введите длину передней шкаторины бизань-топселя (TYL): ");
            a.setTYL(sc.nextDouble());
            System.out.println("Введите длину перпендикуляра передней шкаторины бизань-топсела (TYLP): ");
            a.setTYLP(sc.nextDouble());
        }
    }

    /**
     * Метод, считывающий необходимые данные для подсчета SAK (Площади бизань-стакселя)
     */
    public static void SAKinput(Yacht a, Scanner sc){
//SAK
        System.out.println("Введите длину передней шкаторины бизань-стакселя (YSL): ");
        a.setYSL(sc.nextDouble());
        System.out.println("Введите длину перпендикуляра передней шкаторины бизань-стакселя (YSLP): ");
        a.setYSLP(sc.nextDouble());
        System.out.println("Введите среднюю ширину бизань-стакселя (YSMG): ");
        a.setYSMG(sc.nextDouble());
    }

    /**
     * Метод, считывающий необходимые данные для подсчета SAB (Площади парусов между мачтами)
     */
    public static void SABinput(Yacht a, Scanner sc){
//SAB
        System.out.println("Введите расстояние между мачтами (EB): ");
        a.setEB(sc.nextDouble());
        if (a.getPSF() == 0) {
            System.out.println("Введите высоту подъема парусов на фок-мачте (PSF1): ");
            a.setPSF1(sc.nextDouble());
        }
        System.out.println("Введите высоту подъема парусов на грот-мачтe (IS): ");
        a.setIS(sc.nextDouble());
    }

    /**
     * Метод, считывающий необходимые данные для подсчета SQTSA (Площади прямых парусов марсельной шхуны)
     */
    public static void SQTSAinput(Yacht a, Scanner sc){
        System.out.println("Введите высоту подъема прямых парусов над нижним реем (HT): ");
        a.setHT(sc.nextDouble());
        System.out.println("Введите минимальную ширину самого верхнего прямого паруса (MNWT): ");
        a.setMNWT(sc.nextDouble());
        System.out.println("Введите максимальную ширину нижнего марселя (MXWT): ");
        a.setMXWT(sc.nextDouble());
        System.out.println("Ставится ли раффи над верхним парусом? y/n");
        a.setTemp(sc.next());
        if (a.getTemp().equalsIgnoreCase("y")) {
            a.setRaffy(true);
            System.out.println("Какой высоты?");
            a.setRaffy_length(sc.nextDouble());
        }
        else a.setRaffy(false);
    }

    /**
     * Метод, считывающий необходимые данные для подсчета SQSA (Площади прямых парусов бригантины)
     */
    public static void SQSAinput(Yacht a, Scanner sc){
        System.out.println("Введите высоту подъема прямых парусов (PSF2): ");
        a.setPSF2(sc.nextDouble());
        System.out.println("Введите минимальную ширину самого верхнего прямого паруса (MNWF): ");
        a.setMNWF(sc.nextDouble());
        System.out.println("Введите максимальную ширину фока (MXWF): ");
        a.setMXWF(sc.nextDouble());
        System.out.println("Ставится ли раффи над верхним парусом? y/n");
        a.setTemp(sc.next());
        if (a.getTemp().equalsIgnoreCase("y")) {
            a.setRaffy(true);
            System.out.println("Какой высоты? ");
            a.setRaffy_length(sc.nextDouble());
        }
        else a.setRaffy(false);
    }

    /**
     * Метод, считывающий необходимые данные для подсчета MSA (Площади грот-стакселя)
     */
    public static void MSAinput(Yacht a, Scanner sc){
        System.out.println("Введите длину передней шкаторины горт-стакселя (MSL): ");
        a.setMSL(sc.nextDouble());
        System.out.println("Введите длину перепендикуляра передней шкаторины грот-стакселя (MSLP): ");
        a.setMSLP(sc.nextDouble());
    }

    /**
     * Метод, считывающий необходимые данные для подсчета MTSA (Площади грот-стень-стакселя)
     */
    public static void MTSAinput(Yacht a, Scanner sc){
        System.out.println("Введите длину передней шкаторины грот-стень-стакселя (MTL): ");
        a.setMTL(sc.nextDouble());
        System.out.println("Введите длину перпендикуляра передней шкаторины грот-стень-стакселя (MTLP): ");
        a.setMTLP(sc.nextDouble()); //примечание
    }

    /**
     * Метод, считывающий необходимые данные для подсчета SAF (Площади передних стакселей)
     */
    public static void SAFinput(Yacht a, Scanner sc){
        System.out.println("Введите длину передней шкаторины наружного стакселя (JL): ");
        a.setJL(sc.nextDouble());
        System.out.println("Введите длину передней шкаторины внутреннего стакселя (JLI): ");
        a.setJLI(sc.nextDouble());
        System.out.println("Введите длину перпендикуляра передней шкаторины наружного стакселя (LP): ");
        a.setLP(sc.nextDouble());
        System.out.println("Введите длину перпендикуляра передней шкаторины внутреннего стакселя (LPI): ");
        a.setLPI(sc.nextDouble());
        System.out.println("Введите FSP, я не знаю что это такое (FSP): ");
        a.setFSP(sc.nextDouble());
        System.out.println("Введите FSPI, это я тоже не знаю (FSPI): ");
        a.setFSPI(sc.nextDouble());

        System.out.println("Какой парус установлен?");
        System.out.println("1 - Спинакер");
        System.out.println("2 - Геннакер");
        System.out.println("3 - оба");
        a.setSpinnaker_type(sc.nextDouble());
        System.out.println("Введите основание переднего треугольника (J): ");
        a.setJ(sc.nextDouble());
        System.out.println("Введите длину спинакер-гика (SPL): ");
        a.setSPL(sc.nextDouble());
        System.out.println("Введите максимальную ширину спинакера (SMW): ");
        a.setSMW(sc.nextDouble());
        if (a.getSpinnaker_type() != 1){
            System.out.println("Введите расстояние между срединами передней и задней шкаторин геннакера (SMG): ");
            a.setSMG(sc.nextDouble());

        }

    }

    /**
     * Метод, считывающий необходимые данные для подсчета PF (Коэффициентa типа вооружения)
     */
    public static void PFinput(Yacht a, Scanner sc){
        System.out.println("На вашей яхте есть винт? y/n");
        a.setTemp(sc.next());
        if (a.getTemp().equalsIgnoreCase("y")){
            a.setScrew(true);
            System.out.println("Какой?");
            System.out.println("1 - Складной");
            System.out.println("2 - Поворотный");
            System.out.println("3 - Жесткий 2-лоп.");
            System.out.println("4 - Жесткий 3-4-лоп.");
            a.setScrew_type(sc.nextDouble());
            System.out.println("Вне выреза или в вырезе?");
            System.out.println("1 - Вне выреза");
            System.out.println("2 - В вырезе");
            a.setScrew_cutout(sc.nextDouble());
            System.out.println("Винт будет поднят на время гонки? y/n");
            a.setTemp(sc.next());
            if(a.getTemp().equals("y")) a.setScrew_InOut(true);
            else a.setScrew_InOut(false);
            System.out.println("С какой скоростью винт может двигать яхту?");
            a.setScrew_speed(sc.nextDouble());
        }
        else a.setScrew(false);
    }

    /**
     * Метод, считывающий необходимые данные для подсчета SPIN (Расчётной площади спинакера)
     */
    public static void SPINinput(Yacht a, Scanner sc) {

        if (a.getSpinnaker_type() == 1) {
            System.out.println("Не установлен ли вместо спинакера брифок, марсель и/или раффи? y/n");
            a.setTemp(sc.next());
            if (a.getTemp().equalsIgnoreCase("y")) {
                System.out.println("Введите сумму длин боковых шкаторин брифока, марселя и раффи (SL):  ");
                a.setSL(sc.nextDouble());
                System.out.println("Введите сумму длин реев (SPL1): ");
                a.setSPL1(sc.nextDouble());
            }
            else {
                System.out.println("Введите длину боковой шкаторины спинакера (SL): ");
                a.setSL(sc.nextDouble());
                System.out.println("Введите длину нижней шкаторины спинакера (SFs): ");
                a.setSFs(sc.nextDouble());
            }
        }

        if (a.getSpinnaker_type() == 2){
            System.out.println("Введите длину передней шкаторины геннакера (SLU): ");
            a.setSLU(sc.nextDouble());
            System.out.println("Введите длину задней шкаторины геннакера (SLE): ");
            a.setSLE(sc.nextDouble());
            System.out.println("Введите длину нижней шкаторины геннакера (SFg): ");
            a.setSFg(sc.nextDouble());
            System.out.println("Введите положение спинакер-галса (TPS): ");
            a.setTPS(sc.nextDouble());
            System.out.println("Применяется ли на яхте поворотный бушприт? y/n");
            a.setTemp(sc.next());
            if (a.getTemp().equalsIgnoreCase("y")) a.setBowsprit(true);
            else a.setBowsprit(false);
        }
        if (a.getSpinnaker_type() == 3){
            System.out.println("Не установлен ли вместо спинакера брифок, марсель и/или раффи? y/n");
            a.setTemp(sc.next());
            if (a.getTemp().equalsIgnoreCase("y")) {
                System.out.println("Введите сумму длин боковых шкаторин брифока, марселя и раффи (SL): ");
                a.setSL(sc.nextDouble());
                System.out.println("Введите сумму длин реев (SPL1): ");
                a.setSPL1(sc.nextDouble());
            }
            else {
                System.out.println("Введите длину боковой шкаторины спинакера (SL): ");
                a.setSL(sc.nextDouble());
                System.out.println("Введите длину нижней шкаторины спинакера (SFs): ");
                a.setSFs(sc.nextDouble());
            }
            System.out.println("Введите длину передней шкаторины геннакера (SLU): ");
            a.setSLU(sc.nextDouble());
            System.out.println("Введите длину задней шкаторины геннакера (SLE): ");
            a.setSLE(sc.nextDouble());
            System.out.println("Введите длину нижней шкаторины геннакера (SFg): ");
            a.setSFg(sc.nextDouble());
            System.out.println("Введите положение спинакер-галса (TPS): ");
            a.setTPS(sc.nextDouble());
            System.out.println("Применяется ли на яхте поворотный бушприт? y/n");
            a.setTemp(sc.next());
            if (a.getTemp().equalsIgnoreCase("y")) a.setBowsprit(true);
            else a.setBowsprit(false);
        }

    }

    /**
     * Метод, считывающий необходимые данные для подсчета NRP (Штрафа за планировку)
     */
    public static void NRPinput(Yacht a, Scanner sc){
        System.out.println("Какова высота в каюте?");
        a.setCabin_height(sc.nextDouble());
        System.out.println("Каково количество спальных мест?");
        a.setBed_amount(sc.nextDouble());
        System.out.println("Какова длина спального места?");
        a.setBed_length(sc.nextDouble());
        System.out.println("Сдвоенные или обычные спальные места?");
        System.out.println("1 - сдвоенные");
        System.out.println("2 - обычные");
        a.setBed_type(sc.nextDouble());
            System.out.println("Какова ширина спального места на середине длины?");
            a.setBed_width(sc.nextDouble());
        }

    /**
     * Главный метод
     */
    public static void main(String[] args) throws NegativeException {
        Scanner sc = new Scanner(System.in);
        Yacht a = new Yacht();
        Calculate b = new Calculate();

        BWLinput(a, sc);
        Ginput(a, sc);
        b.BWLcalc(a);
        b.Gcalc(a);

        Linput(a, sc);
        System.out.println("Каков ваш вид вооружения?");
        System.out.println("1 - Кэт");
        System.out.println("2 - Шлюп");
        System.out.println("3 - Тендер");
        System.out.println("4 - Иол");
        System.out.println("5 - Кеч");
        System.out.println("6 - Бермудская шхуна");
        System.out.println("7 - Шхуна с гафельным фоком");
        System.out.println("8 - Стаксельный кеч");
        System.out.println("9 - Стаксельная шхуна");
        System.out.println("10 - Марсельная шхуна");
        System.out.println("11 - Бригантина");
        a.setWeapon_type(sc.nextDouble());
        System.out.println("Ваша яхта серийного производства? y/n");
        a.setTemp(sc.next());
        if(a.getTemp().equals("y")) {
            System.out.println("Каков год выпуска первой яхты серии?");
            a.setYEAR(sc.nextDouble());
        }
        else {
            System.out.println("Каков год производства вашей яхты?");
            a.setYEAR(sc.nextDouble());
        }


        SAMinput(a, sc);

        if ((a.getWeapon_type() == 2) || (a.getWeapon_type() == 3)) {
            SAFinput(a, sc);
        }
        if ((a.getWeapon_type() == 4) || (a.getWeapon_type() == 5)) {
            SAFinput(a, sc);
            SAKinput(a, sc);
            SAYinput(a, sc);
        }
        if (a.getWeapon_type() == 6) {
            SAFinput(a, sc);
            SAGinput(a, sc);
        }
        if (a.getWeapon_type() == 7) {
            SAFinput(a, sc);
            SAGinput(a, sc);
            MTSAinput(a, sc);
        }
        if ((a.getWeapon_type() == 8) || (a.getWeapon_type() == 9)) {
            SAFinput(a, sc);
            SABinput(a, sc);
        }
        if (a.getWeapon_type() == 10){
            SAFinput(a, sc);
            SAGinput(a, sc);
            SQTSAinput(a, sc);
            MTSAinput(a, sc);
        }
        if (a.getWeapon_type() == 11){
            SAFinput(a, sc);
            SQSAinput(a, sc);
            MSAinput(a, sc);
            MTSAinput(a, sc);
        }

        PFinput(a, sc);
        SPINinput(a, sc);

        if(a.getYEAR() > 1986) NRPinput(a, sc);
        b.Rcalc(a);


    }
}
