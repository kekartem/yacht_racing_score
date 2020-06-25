public class Calculate {
    /**
    * Метод, вычисляющий BWL (Ширину по ватерлинии)
    */
    public void BWLcalc(Yacht a) {
        a.setBWL(a.getBMAX() - a.getdB1() - a.getdB2());
    }

    /**
     * Метод, вычисляющий G
     */
    public void Gcalc(Yacht a) {
        a.setG(a.getGMAX1() - a.getFG1() - a.getFG2());
    }

    /**
     * Метод, вычисляющий AGO (Длину кормового свеса)
     */
    public void AGOcalc(Yacht a) {
        if (a.getHA() > 0.03*(a.getBWL()+a.getG())) {
            a.setAGO(a.getOHAT() * (1 - 0.03*(a.getBWL()+a.getG()) / a.getHA()));
        }
    }

    /**
     * Метод, вычисляющий L (Обмерную длину яхты)
     */
    public void Lcalc(Yacht a){
        AGOcalc(a);
        a.setL(a.getLOA() - a.getFGO() - a.getAGO());
    }

    /**
     * Метод, вычисляющий SAM(Площадь грота)
     */
    public void SAMcalc(Yacht a) {
        //SAM
        if (a.getCave_Type() == 1) {
            double m = 0.15;
            if (0.04 * a.getE() > m) m = 0.04 * a.getE();
            if (a.getHB() > m) a.setPHB(3*(a.getHB() - m));
            else a.setPHB(0);
            double s = 0;
            m = 0.12 * a.getE() + 0.305;
            if (0.34 * a.getE() > m) m = 0.34 * a.getE();
            if (a.getBL2() > m) s += a.getBL2() - m;
            if (a.getBL3() > m) s += a.getBL3() - m;
            if (a.getBL4() > m) s += a.getBL4() - m;
            m = 0.28 * a.getE() + 0.016 * a.getP() + 0.26;
            if (0.38 * a.getE() > m) m = 0.38 * a.getE();
            if (a.getMGU() > m) a.setBL1(a.getBL1() + a.getMGU() - m);
            m = 0.5 * a.getE() + 0.022 * a.getP() + 0.37;
            if (0.65 * a.getE() > m) m = 0.65 * a.getE();
            if (a.getMGM() > m) a.setBL1(a.getBL1() + a.getMGM() - m);
            m = 0.1 * a.getE() + 0.305;
            if (0.21 * a.getE() > m) m = 0.21 * a.getE();
            if (a.getBL1() > m) s += a.getBL1() - m;
            s += a.getBL5();
            a.setPBL(s / 2.0);
            a.setEC(a.getE() + a.getPHB() + a.getPBL());
            m = a.getP() * (a.getHB() + 2 * a.getMGU() + 3 * a.getMGM() + 2 * a.getE()) / 8.0;
            if (a.getP() * a.getEC() / 2.0 < m) m = a.getP() * a.getEC() / 2.0;
            a.setSAM(m);
        } else {
            a.setMSAT(a.getTL() * a.getTLP() / 2.0);
            a.setSAM(0.8 * (a.getMSAT() + (a.getH() * a.getE() + a.getGM() * Math.pow((a.getH() * a.getH() + a.getE() * a.getE()), 0.5)) / 2));
        }
    }

    /**
     * Метод, вычисляющий SAG(Площадь фока)
     */
    public void SAGcalc(Yacht a) {
        //SAG
        if (a.getFok_type() == 1) {
            double m = 0.15;
            if (0.04 * a.getEF() > m) m = 0.04 * a.getEF();
            if (a.getHBF() > m) a.setPBF(3*(a.getHBF() - m));
            else a.setPBF(0);
            double s = 0;
            m = 0.12 * a.getEF() + 0.305;
            if (0.34 * a.getEF() > m) m = 0.34 * a.getEF();
            if (a.getBF2() > m) s += a.getBF2() - m;
            if (a.getBF3() > m) s += a.getBF3() - m;
            if (a.getBF4() > m) s += a.getBF4() - m;
            m = 0.28 * a.getEF() + 0.016 * a.getPSF() + 0.26;
            if (0.38 * a.getEF() > m) m = 0.38 * a.getEF();
            if (a.getGUF() > m) a.setBF1(a.getBF1() + a.getGUF() - m);
            m = 0.5 * a.getEF() + 0.022 * a.getPSF() + 0.37;
            if (0.65 * a.getEF() > m) m = 0.65 * a.getEF();
            if (a.getGMF() > m) a.setBF1(a.getBF1() + a.getGMF() - m);
            m = 0.1 * a.getEF() + 0.305;
            if (0.21 * a.getEF() > m) m = 0.21 * a.getEF();
            if (a.getBF1() > m) s += a.getBF1() - m;
            s += a.getBF5();
            a.setPHBF(s / 2);
            a.setEFC(a.getEF() + a.getPBF() + a.getPHBF());
            m = a.getPSF() * (a.getHBF() + 2 * a.getGUF() + 3 * a.getGMF() + 2 * a.getEF()) / 8;
            if (a.getPSF() * a.getEFC() / 2.0 < m) m = a.getPSF() * a.getEFC() / 2;
            a.setSAG(m);
        } else {
            a.setMSATF(a.getTFL() * a.getTFLP() / 2);
            a.setSAG(0.8 * (a.getMSATF() + (a.getHF() * a.getEF() + a.getGF() * Math.pow(a.getHF() * a.getHF() + a.getEF() * a.getEF(), 0.5)) / 2));
        }
    }

    /**
     * Метод, вычисляющий SAY(Площадь бизани)
     */
    public void SAYcalc(Yacht a) {
        //SAY
        if (a.getMizzen_type() == 1) {
            double m = 0.15;
            if (0.04 * a.getEY() > m) m = 0.04 * a.getEY();
            if (a.getHBY() > m) a.setPBY(3*(a.getHBY() - m));
            else a.setPBY(0);
            double s = 0;
            m = 0.12 * a.getEY() + 0.305;
            if (0.34 * a.getEY() > m) m = 0.34 * a.getEY();
            if (a.getBY2() > m) s += a.getBY2() - m;
            if (a.getBY3() > m) s += a.getBY3() - m;
            if (a.getBY4() > m) s += a.getBY4() - m;
            m = 0.28 * a.getEY() + 0.016 * a.getPY() + 0.26;
            if (0.38 * a.getEY() > m) m = 0.38 * a.getEY();
            if (a.getGUY() > m) a.setBY1(a.getBY1() + a.getGUY() - m);
            m = 0.5 * a.getEY() + 0.022 * a.getPY() + 0.37;
            if (0.65 * a.getEY() > m) m = 0.65 * a.getEY();
            if (a.getGUY() > m) a.setBY1(a.getBY1() + a.getGUY() - m);
            m = 0.1 * a.getEY() + 0.305;
            if (0.21 * a.getEY() > m) m = 0.21 * a.getEY();
            if (a.getBY1() > m) s += a.getBY1() - m;
            s += a.getBY5();
            a.setPHBY(s / 2.0);
            a.setEYC(a.getEY() + a.getPBY() + a.getPHBY());
            m = a.getPY() * (a.getHBY() + 2 * a.getGUY() + 3 * a.getGMY() + 2 * a.getEY()) / 8.0;
            if (a.getPY() * a.getEYC() / 2.0 < m) m = a.getPY() * a.getEYC() / 2.0;
            a.setSAY(m);
        } else {
            a.setMSATY(a.getTYL() * a.getTYLP() / 2.0);
            a.setSAY(0.8 * (a.getMSATY() + (a.getHY() * a.getEY() + a.getGY() * Math.pow(a.getHY() * a.getHY() + a.getEY() * a.getEY(), 0.5)) / 2.0));
        }
    }

    /**
     * Метод, вычисляющий SAK (Площадь бизань-стакселя)
     */
    public void SAKcalc(Yacht a) {
        //SAK
        a.setSAK(a.getYSL() * (a.getYSLP() + 2 * a.getYSMG()) / 4.0);
    }

    /**
     * Метод, вычисляющий YSAC (Комбинацию площадей бизани и бизань-стакселя)
     */
    public void YSACcalc(Yacht a) {
        //YSAC
        if (a.getSAK() >= a.getSAY()) a.setYSAC(a.getSAK());
        else a.setYSAC(a.getSAY());
    }

    /**
     * Метод, вычисляющий SAB (Площадь парусов между мачтами)
     */
    public void SABcalc(Yacht a) {
        //SAB
        a.setSAB(a.getEB() * (a.getPSF1() + a.getIS()) / 2);
    }

    /**
     * Метод, вычисляющий SQTSA (Площадь прямых парусов марсельной шхуны)
     */
    public void SQTSAcalc(Yacht a) {
        //SQTSA
        if (a.isRaffy()) a.setHT(a.getHT() + 0.5*a.getRaffy_length());
        a.setSQTSA(3 * a.getHT() * (a.getMNWT() + a.getMXWT()) / 8);
    }

    /**
     * Метод, вычисляющий SQSA (Площадь прямых парусов бригантины)
     */
    public void SQSAcalc(Yacht a) {
        //SQSA
        if (a.isRaffy()) a.setPSF2(a.getPSF2() + 0.5*a.getRaffy_length());
        a.setSQSA(3 * a.getPSF2() * (a.getMNWF() + a.getMXWF()) / 8);
    }

    /**
     * Метод, вычисляющий MSA (Площадь грот-стакселя)
     */
    public void MSAcalc(Yacht a) {
        //MSA
        a.setMSA(a.getMSL() * a.getMSLP() / 2);
    }

    /**
     * Метод, вычисляющий MTSA (Площадь грот-стень-стакселя)
     */
    public void MTSAcalc(Yacht a) {
        //MTSA
        a.setMTSA(a.getMTL() * a.getMTLP() / 2);
    }

    /**
     * Метод, вычисляющий SAF (Площадь передних стакселей)
     */
    public void SAFcalc(Yacht a){
        //SAF
        if (a.getSpinnaker_type() == 1){
            double m = a.getJ();
            if (a.getSPL() > m) m = a.getSPL();
            if (a.getSMW()/1.8 > m) m = a.getSMW()/1.8;
            a.setJC(m);
        }
        else {
            double m = a.getJ();
            if (a.getSPL() > m) m = a.getSPL();
            if (a.getSMW()/1.8 > m) m = a.getSMW()/1.8;
            if (a.getSMG()/1.8 > m) m = a.getSMG()/1.8;
            a.setJC(m);
        }
        a.setSAF(a.getJL()*(a.getJC() + a.getLP() + a.getFSP()) + a.getJLI()*(a.getJC() + a.getLPI() + a.getFSPI()));
    }

    /**
     * Метод, вычисляющий RF (Коэффициент типа вооружения)
     */
    public void RFcalc(Yacht a){
        if ((a.getWeapon_type() == 1) || (a.getWeapon_type() == 2) || (a.getWeapon_type() == 3)) a.setRF(1);
        else if (a.getWeapon_type() == 4) a.setRF(0.95);
        else a.setRF(0.9);
    }

    /**
     * Метод, вычисляющий PF (Kоэффициент винта)
     */
    public void PFcalc(Yacht a){
        if (a.isScrew()){
            if (a.getScrew_speed() >= Math.pow(1.8*a.getL(), 0.5)) {
                if (!a.isScrew_InOut()) {
                    if (a.getScrew_cutout() == 1) {
                        if (a.getScrew_type() == 1) a.setPF(0.990);
                        if (a.getScrew_type() == 2) a.setPF(0.980);
                        if (a.getScrew_type() == 3) a.setPF(0.960);
                        if (a.getScrew_type() == 4) a.setPF(0.940);
                    }
                    if (a.getScrew_cutout() == 2) {
                        if (a.getScrew_type() == 1) a.setPF(0.995);
                        if (a.getScrew_type() == 2) a.setPF(0.990);
                        if (a.getScrew_type() == 3) a.setPF(0.980);
                        if (a.getScrew_type() == 4) a.setPF(0.960);
                    }
                }
                else a.setPF(1);
            }
            else a.setPF(1);
        }
        else a.setPF(1);
    }

    /**
     * Метод, вычисляющий SPIN (Расчётную площадь спинакера)
     */
    public void SPINcalc(Yacht a){
        if (a.getSpinnaker_type() == 1){
            double m = a.getSPL1()*1.8;
            if (a.getJ()*1.8 > m) m = a.getJ()*1.8;
            if (a.getSFs() > m) m = a.getSFs();
            a.setSFCs(m);
            if (a.getSPL1() == 0) m = a.getSPL();
            else m = 1.8*a.getSPL1();
            if (a.getJ()*1.8 > m) m = a.getJ()*1.8;
            if (a.getSMW() > m) m = a.getSMW();
            a.setSMWC(m);
            a.setSPIN(0.06*Math.pow((2*a.getSL() + (a.getSFCs() + a.getSMWC())/2), 2));
        }
        if (a.getSpinnaker_type() == 2) {
            double i = 1.2;
            if (a.isBowsprit()){
                i = 1.5;
            }
            double m = a.getSFg();
            if (i*a.getTPS() > m) m = i*a.getTPS();
            a.setSFCg(m);
            m = a.getSMG();
            if (i*a.getTPS() > m) m = i*a.getTPS();
            a.setSMGC(m);
            a.setSLC(0.6*a.getSLU() + 0.4*a.getSLE());
            a.setSPIN(0.06*Math.pow((2*a.getSLC()+(a.getSFCg()+a.getSMGC())/2), 2));
        }
        if (a.getSpinnaker_type() == 3) {
            double m = a.getSPL()*1.8;
            if (a.getJ()*1.8 > m) m = a.getJ()*1.8;
            if (a.getSFs() > m) m = a.getSFs();
            a.setSFCs(m);
            if (a.getSPL1() == 0) m = a.getSPL();
            else m = a.getSPL1();
            if (a.getJ()*1.8 > m) m = a.getJ()*1.8;
            if (a.getSMW() > m) m = a.getSMW();
            a.setSMWC(m);
            a.setSAspin(0.06*Math.pow((2*a.getSL() + (a.getSFCs() + a.getSMWC())/2), 2));
            double i = 1.2;
            //////
            if (a.isBowsprit()){
                i = 1.5;
            }
            m = a.getSFg();
            if (i*a.getTPS() > m) m = i*a.getTPS();
            a.setSFCg(m);
            m = a.getSMG();
            if (i*a.getTPS() > m) m = i*a.getTPS();
            a.setSMGC(m);
            a.setSLC(0.6*a.getSLU() + 0.4*a.getSLE());
            a.setSAgen(0.06*Math.pow((2*a.getSLC()+(a.getSFCg()+a.getSMGC())/2), 2));
            m = a.getSAspin();
            if (a.getSAgen() > m) m = a.getSAgen();
            a.setSPIN(m);
        }

    }

    /**
     * Метод, вычисляющий S (Обмерную площадь яхты)
     */
    public void Scalc(Yacht a) {
        //SAMcalc(a);

        if (a.getWeapon_type() == 1){
            a.setS(a.getSAM());
        }
        if ((a.getWeapon_type() == 2) || (a.getWeapon_type() == 3)) {
            SAFcalc(a);
            a.setS(a.getSAM() + a.getSAF());
        }
        if ((a.getWeapon_type() == 4) || (a.getWeapon_type() == 5)) {
            SAFcalc(a);
            SAKcalc(a);
            SAYcalc(a);
            YSACcalc(a);
            a.setS(a.getSAM() + a.getSAF() + a.getYSAC());
        }
        if (a.getWeapon_type() == 6) {
            SAFcalc(a);
            SAGcalc(a);
            a.setS(a.getSAM() + a.getSAF() + a.getSAG());
        }
        if (a.getWeapon_type() == 7) {
            SAFcalc(a);
            SAGcalc(a);
            MTSAcalc(a);
            a.setS(a.getSAM() + a.getSAF() + a.getSAG() + a.getMTSA());
        }
        if ((a.getWeapon_type() == 8) || (a.getWeapon_type() == 9)) {
            SAFcalc(a);
            SABcalc(a);
            a.setS(a.getSAM() + a.getSAF() + a.getSAB());
        }
        if (a.getWeapon_type() == 10) {
            SAFcalc(a);
            SAGcalc(a);
            SQTSAcalc(a);
            MTSAcalc(a);
            a.setS(a.getSAM() + a.getSAF() + a.getSQTSA() + a.getMTSA() + a.getSAG());
        }
        if (a.getWeapon_type() == 11) {
            SAFcalc(a);
            SQSAcalc(a);
            MSAcalc(a);
            MTSAcalc(a);
            a.setS(a.getSAM() + a.getSAF() + a.getSQSA() + a.getMSA() + a.getMTSA());
        }
    }

    /**
     * Метод, вычисляющий PSPIN (Штраф за избыточную площадь спинакера)
     */
    public void PSPINcalc(Yacht a){
        if (a.getSPIN() > a.getS()) a.setPSPIN((a.getSPIN() - a.getS())/2);
        else a.setPSPIN(0);
    }

    /**
     * Метод, вычисляющий SC (Расчётную площадь парусности)
     */
    public void SCcalc(Yacht a){
        Scalc(a);
        SPINcalc(a);
        PSPINcalc(a);
        a.setSC(a.getS()+a.getPSPIN());
    }

    /**
     * Метод, вычисляющий SPF (Коэффициент спинакера)
     */
    public void SPFcalc(Yacht a){
        if ((a.getSpinnaker_type() == 1) || (a.getSpinnaker_type() == 3)) a.setSPF(1);
        else a.setSPF(0.8);
    }

    /**
     * Метод, вычисляющий NRP (Штраф за планировку)
     */
    public void NRPcalc(Yacht a){
        if (a.getYEAR() <= 1986) a.setNRP(0);
        else{
            if (a.getLOA() < 8.5) {
                if (a.getCabin_height() < 0.07*a.getLOA() + 0.76) a.setNRP(a.getNRP() + 1.5);
            }
            else{
                if (a.getCabin_height() < 1.7) a.setNRP(a.getNRP()+1.5);
            }

            if (a.getLOA() < 6){
                if (a.getBed_amount() < 2) a.setNRP(a.getNRP()+1.5);
                if (a.getBed_length() < 1.85) a.setNRP(a.getNRP()+1.5);
            }
            else {
                if (a.getBed_amount() < 4) a.setNRP(a.getNRP()+1.5);
                if (a.getBed_length() < 1.9) a.setNRP(a.getNRP()+1.5);
            }

            if (a.getBed_type() == 1){
                if(a.getBed_width() <= 1) a.setNRP(a.getNRP()+1.5);
            }
            else {
                if(a.getBed_width() <= 0.55) a.setNRP(a.getNRP()+1.5);
            }

        }
        if(a.getNRP() > 4.5) a.setNRP(4.5);
    }

    /**
     * Метод, вычисляющий R (Гоночный балл яхты)
     */
    public void Rcalc(Yacht a) {
        Lcalc(a);
        Gcalc(a);
        BWLcalc(a);
        RFcalc(a);
        SCcalc(a);
        SPFcalc(a);
        PFcalc(a);
        NRPcalc(a);
        a.setR(0.5*(a.getL() + (2.0*a.getG())/3.0 - a.getBWL() + 0.75*a.getRF()*Math.pow(a.getSC()*a.getSPF(), 0.5))*a.getPF()*(1+a.getNRP()));
        System.out.println("Гоночный балл R = " + a.getR());
    }

}

