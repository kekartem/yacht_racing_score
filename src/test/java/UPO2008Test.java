import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UPO2008Test {

    @Test
    public void testSAM0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setCave_Type(1);
        yacht.setP(10);
        yacht.setE(10);
        yacht.setHB(0.5);
        yacht.setBL1(1);
        yacht.setBL2(1);
        yacht.setBL3(1);
        yacht.setBL4(1);
        yacht.setBL5(0);
        yacht.setMGU(2);
        yacht.setMGM(3);
        yacht.setGM(0);
        yacht.setTL(0);
        yacht.setTLP(0);
        yacht.setH(0);
        calculator.SAMcalc(yacht);
        assertEquals(yacht.getSAM(), 41.8750, 0.0002);
    }

    @Test
    public void testSAM1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setCave_Type(2);
        yacht.setE(3);
        yacht.setGM(2);
        yacht.setH(3);
        yacht.setTL(2);
        yacht.setTLP(5);
        calculator.SAMcalc(yacht);
        assertEquals(yacht.getSAM(), 10.9941, 0.0002);
    }

    @Test
    public void testSAM2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setCave_Type(1);
        yacht.setP(10);
        yacht.setE(0.375);
        yacht.setHB(0.15);
        yacht.setBL1(0);
        yacht.setBL2(0);
        yacht.setBL3(0);
        yacht.setBL4(0);
        yacht.setBL5(0);
        yacht.setMGU(2);
        yacht.setMGM(3);
        yacht.setGM(0);
        yacht.setTL(0);
        yacht.setTLP(0);
        yacht.setH(0);
        calculator.SAMcalc(yacht);
        assertEquals(yacht.getSAM(), 10.2625, 0.0002);
    }

    @Test
    public void testSAM3(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setCave_Type(1);
        yacht.setP(10);
        yacht.setE(0.375);
        yacht.setHB(0.15);
        yacht.setBL1(1);
        yacht.setBL2(1);
        yacht.setBL3(1);
        yacht.setBL4(1);
        yacht.setBL5(0);
        yacht.setMGU(2);
        yacht.setMGM(3);
        yacht.setGM(0);
        yacht.setTL(0);
        yacht.setTLP(0);
        yacht.setH(0);
        yacht.setEC(17.925);
        calculator.SAMcalc(yacht);
        assertEquals(yacht.getSAM(), 17.3750, 0.0002);
    }

    @Test
    public void testSAG0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setFok_type(1);
        yacht.setPSF(10);
        yacht.setEF(10);
        yacht.setHBF(0.5);
        yacht.setBF1(1);
        yacht.setBF2(1);
        yacht.setBF3(1);
        yacht.setBF4(1);
        yacht.setBF5(0);
        yacht.setGUF(2);
        yacht.setGMF(3);
        yacht.setHF(0);
        yacht.setGF(0);
        yacht.setTFL(0);
        yacht.setTFLP(0);
        calculator.SAGcalc(yacht);
        assertEquals(yacht.getSAG(), 41.8750, 0.0002);
    }

    @Test
    public void testSAG1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setFok_type(2);
        yacht.setEF(3);
        yacht.setHF(3);
        yacht.setGF(2);
        yacht.setTFL(2);
        yacht.setTFLP(5);
        calculator.SAGcalc(yacht);
        assertEquals(yacht.getSAG(), 10.9941, 0.0002);
    }

    @Test
    public void testSAG2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setFok_type(1);
        yacht.setPSF(10);
        yacht.setEF(0.375);
        yacht.setHBF(0.15);
        yacht.setBF1(1);
        yacht.setBF2(1);
        yacht.setBF3(1);
        yacht.setBF4(1);
        yacht.setBF5(0);
        yacht.setGUF(2);
        yacht.setGMF(3);
        yacht.setHF(0);
        yacht.setGF(0);
        yacht.setTFL(0);
        yacht.setTFLP(0);
        yacht.setEFC(19.0);
        calculator.SAGcalc(yacht);
        assertEquals(yacht.getSAG(), 17.375, 0.0002);
    }

    @Test
    public void testSAG3(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setFok_type(1);
        yacht.setPSF(10);
        yacht.setEF(0.375);
        yacht.setHBF(0.15);
        yacht.setBF1(0);
        yacht.setBF2(0);
        yacht.setBF3(0);
        yacht.setBF4(0);
        yacht.setBF5(0);
        yacht.setGUF(2);
        yacht.setGMF(3);
        yacht.setHF(0);
        yacht.setGF(0);
        yacht.setTFL(0);
        yacht.setTFLP(0);
        yacht.setTFLP(0);
        yacht.setEFC(17.925);
        calculator.SAGcalc(yacht);
        assertEquals(yacht.getSAG(), 10.2625, 0.0002);
    }

    @Test
    public void testSAY0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setMizzen_type(1);
        yacht.setPY(10);
        yacht.setEY(10);
        yacht.setHBY(0.5);
        yacht.setBY1(1);
        yacht.setBY2(1);
        yacht.setBY3(1);
        yacht.setBY4(1);
        yacht.setBY5(0);
        yacht.setGUY(2);
        yacht.setGMY(3);
        yacht.setGY(0);
        yacht.setTYL(0);
        yacht.setTYLP(0);
        yacht.setHY(0);
        calculator.SAYcalc(yacht);
        assertEquals(yacht.getSAY(), 41.8750, 0.0001);
    }

    @Test
    public void testSAY1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setMizzen_type(2);
        yacht.setEY(3);
        yacht.setGY(2);
        yacht.setTYL(2);
        yacht.setTYLP(5);
        yacht.setHY(3);
        calculator.SAYcalc(yacht);
        assertEquals(yacht.getSAY(), 10.9941, 0.0001);
    }

    @Test
    public void testSAY2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setMizzen_type(1);
        yacht.setPY(10);
        yacht.setEY(0.375);
        yacht.setHBY(0.15);
        yacht.setBY1(1);
        yacht.setBY2(1);
        yacht.setBY3(1);
        yacht.setBY4(1);
        yacht.setBY5(0);
        yacht.setGUY(2);
        yacht.setGMY(3);
        yacht.setGY(0);
        yacht.setTYL(0);
        yacht.setTYLP(0);
        yacht.setHY(0);
        yacht.setEYC(19.0);
        calculator.SAYcalc(yacht);
        assertEquals(yacht.getSAY(), 15.1375, 0.0001);
    }

    @Test
    public void testSAY3(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setMizzen_type(1);
        yacht.setPY(10);
        yacht.setEY(0.375);
        yacht.setHBY(0.15);
        yacht.setBY1(1);
        yacht.setBY2(1);
        yacht.setBY3(1);
        yacht.setBY4(1);
        yacht.setBY5(0);
        yacht.setGUY(2);
        yacht.setGMY(3);
        yacht.setGY(0);
        yacht.setTYL(0);
        yacht.setTYLP(0);
        yacht.setHY(0);
        yacht.setEYC(17.925);
        calculator.SAYcalc(yacht);
        assertEquals(yacht.getSAY(), 15.1375, 0.0001);
    }

    @Test
    public void testSAK(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setYSL(3);
        yacht.setYSLP(5);
        yacht.setYSMG(4);
        calculator.SAKcalc(yacht);
        assertEquals(yacht.getSAK(), 9.7500, 0.0001);
    }

    @Test
    public void testYSAC0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSAK(9.8);
        yacht.setSAY(9.75);
        calculator.YSACcalc(yacht);
        assertEquals(yacht.getYSAC(), 9.8000, 0.0001);

    }

    @Test
    public void testYSAC1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSAK(9.7);
        yacht.setSAY(9.75);
        calculator.YSACcalc(yacht);
        assertEquals(yacht.getYSAC(), 9.75, 0.0001);

    }

    @Test
    public void testYSAC2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSAK(9.75);
        yacht.setSAY(9.75);
        calculator.YSACcalc(yacht);
        assertEquals(yacht.getYSAC(), 9.75, 0.0001);

    }

    @Test
    public void testSAB(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setEB(2);
        yacht.setPSF1(1.5);
        yacht.setIS(2.5);
        calculator.SABcalc(yacht);
        assertEquals(yacht.getSAB(), 4, 0.0001);
    }

    @Test
    public void testSQTSA0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setRaffy(false);
        yacht.setRaffy_length(0);
        yacht.setHT(4);
        yacht.setMNWT(2);
        yacht.setMXWT(2);
        calculator.SQTSAcalc(yacht);
        assertEquals(yacht.getSQTSA(), 6, 0.0001);
    }

    @Test
    public void testSQTSA1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setRaffy(true);
        yacht.setRaffy_length(0);
        yacht.setHT(4);
        yacht.setMNWT(2);
        yacht.setMXWT(2);
        calculator.SQTSAcalc(yacht);
        assertEquals(yacht.getSQTSA(), 6, 0.0001);
    }

    @Test
    public void testSQSA0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setRaffy(false);
        yacht.setRaffy_length(0);
        yacht.setPSF2(4);
        yacht.setMNWF(2);
        yacht.setMXWF(2);
        calculator.SQSAcalc(yacht);
        assertEquals(yacht.getSQSA(), 6, 0.0001);
    }

    @Test
    public void testSQSA1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setRaffy(true);
        yacht.setRaffy_length(0);
        yacht.setPSF2(4);
        yacht.setMNWF(2);
        yacht.setMXWF(2);
        calculator.SQSAcalc(yacht);
        assertEquals(yacht.getSQSA(), 6, 0.0001);
    }

    @Test
    public void testMSA(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setMSL(2);
        yacht.setMSLP(4);
        calculator.MSAcalc(yacht);
        assertEquals(yacht.getMSA(), 4, 0.0001);
    }

    @Test
    public void testMTSA(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setMTL(4);
        yacht.setMTLP(4);
        calculator.MTSAcalc(yacht);
        assertEquals(yacht.getMTSA(), 8, 0.0001);
    }

    @Test
    public void testSAF0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);
        calculator.SAFcalc(yacht);
        assertEquals(yacht.getSAF(), 24.0333, 0.0001);
    }

    @Test
    public void testSAF1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(2);
        yacht.setFSP(1);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(2);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);
        calculator.SAFcalc(yacht);
        assertEquals(yacht.getSAF(), 18.6666, 0.0001);
    }

    @Test
    public void testSAF2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(3);
        yacht.setSPL(1);
        yacht.setSMW(3.62);
        yacht.setSMG(4);
        calculator.SAFcalc(yacht);
        assertEquals(yacht.getSAF(), 27.0000, 0.0001);
    }

    @Test
    public void testSAF3(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(2);
        yacht.setFSP(1);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(2);
        yacht.setJ(3);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(2);
        calculator.SAFcalc(yacht);
        assertEquals(yacht.getSAF(), 21.0000, 0.0001);
    }


    @Test
    public void testRF0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(1);
        calculator.RFcalc(yacht);
        assertEquals(yacht.getRF(), 1, 0.0001);
    }

    @Test
    public void testRF1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(2);
        calculator.RFcalc(yacht);
        assertEquals(yacht.getRF(), 1, 0.0001);
    }

    @Test
    public void testRF2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(3);
        calculator.RFcalc(yacht);
        assertEquals(yacht.getRF(), 1, 0.0001);
    }


    @Test
    public void testRF3(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(4);
        calculator.RFcalc(yacht);
        assertEquals(yacht.getRF(), 0.95, 0.0001);
    }

    @Test
    public void testRF4(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(5);
        calculator.RFcalc(yacht);
        assertEquals(yacht.getRF(), 0.9, 0.0001);
    }

    @Test
    public void testPF0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(true);
        yacht.setScrew_type(2);
        yacht.setScrew_cutout(1);
        yacht.setScrew_InOut(false);
        yacht.setScrew_speed(10);
        yacht.setL(0);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 0.9800, 0.0001);
    }

    @Test
    public void testPF1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(false);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 1, 0.0001);
    }

    @Test
    public void testPF2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(true);
        yacht.setScrew_type(2);
        yacht.setScrew_cutout(2);
        yacht.setScrew_InOut(false);
        yacht.setScrew_speed(4);
        yacht.setL(11);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 1.0000, 0.0001);
    }

    @Test
    public void testPF3(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(true);
        yacht.setScrew_type(2);
        yacht.setScrew_cutout(2);
        yacht.setScrew_InOut(false);
        yacht.setScrew_speed(10);
        yacht.setL(0);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 0.9900, 0.0001);
    }

    @Test
    public void testPF4(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(true);
        yacht.setScrew_type(2);
        yacht.setScrew_cutout(2);
        yacht.setScrew_InOut(true);
        yacht.setScrew_speed(10);
        yacht.setL(0);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 1.0000, 0.0001);
    }

    @Test
    public void testPF5(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(true);
        yacht.setScrew_type(1);
        yacht.setScrew_cutout(1);
        yacht.setScrew_InOut(false);
        yacht.setScrew_speed(10);
        yacht.setL(0);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 0.9900, 0.0001);
    }

    @Test
    public void testPF6(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(true);
        yacht.setScrew_type(3);
        yacht.setScrew_cutout(1);
        yacht.setScrew_InOut(false);
        yacht.setScrew_speed(10);
        yacht.setL(0);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 0.9600, 0.0001);
    }

    @Test
    public void testPF7(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(true);
        yacht.setScrew_type(4);
        yacht.setScrew_cutout(1);
        yacht.setScrew_InOut(false);
        yacht.setScrew_speed(10);
        yacht.setL(0);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 0.9400, 0.0001);
    }


    @Test
    public void testPF8(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(true);
        yacht.setScrew_type(1);
        yacht.setScrew_cutout(2);
        yacht.setScrew_InOut(false);
        yacht.setScrew_speed(10);
        yacht.setL(0);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 0.9950, 0.0001);
    }


    @Test
    public void testPF9(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(true);
        yacht.setScrew_type(3);
        yacht.setScrew_cutout(2);
        yacht.setScrew_InOut(false);
        yacht.setScrew_speed(10);
        yacht.setL(0);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 0.9800, 0.0001);
    }


    @Test
    public void testPF10(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setScrew(true);
        yacht.setScrew_type(4);
        yacht.setScrew_cutout(2);
        yacht.setScrew_InOut(false);
        yacht.setScrew_speed(10);
        yacht.setL(0);
        calculator.PFcalc(yacht);
        assertEquals(yacht.getPF(), 0.9600, 0.0001);
    }


    @Test
    public void testSPIN0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(1);
        //Если спиннакер 1
        yacht.setSL(2);
        yacht.setSPL1(2);
        yacht.setSFs(1);
        yacht.setJ(1);
        yacht.setSMW(3.62);
        //Если спиннакер 2
        yacht.setSLU(0);
        yacht.setSLE(0);
        yacht.setSFg(0);
        yacht.setTPS(0);
        //Если спиннакер 3 то все подряд
        calculator.SPINcalc(yacht);
        assertEquals(yacht.getSPIN(), 3.4747, 0.0001);
    }


    @Test
    public void testSPIN1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(1);
        //Если спиннакер 1
        yacht.setSL(2);
        yacht.setSPL1(2);
        yacht.setSFs(5.5);
        yacht.setJ(3);
        yacht.setSMW(2);
        //Если спиннакер 2
        yacht.setSLU(0);
        yacht.setSLE(0);
        yacht.setSFg(0);
        yacht.setTPS(0);
        //Если спиннакер 3 то все подряд
        calculator.SPINcalc(yacht);
        assertEquals(yacht.getSPIN(), 5.3581, 0.0001);
    }

    @Test
    public void testSPIN2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(1);
        //Если спиннакер 1
        yacht.setSL(2);
        yacht.setSPL1(0);
        yacht.setSFs(5.5);
        yacht.setJ(3);
        yacht.setSMW(3.62);
        yacht.setSPL(1);
        //Если спиннакер 2
        yacht.setSLU(0);
        yacht.setSLE(0);
        yacht.setSFg(0);
        yacht.setTPS(0);
        //Если спиннакер 3 то все подряд
        calculator.SPINcalc(yacht);
        assertEquals(yacht.getSPIN(), 5.3581, 0.0001);
    }

    @Test
    public void testSPIN3(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(2);
        //Если спиннакер 1
        yacht.setSL(0);
        yacht.setSPL1(0);
        yacht.setSFs(0);
        yacht.setJ(0);
        yacht.setSMW(0);
        yacht.setSPL(0);
        //Если спиннакер 2
        yacht.setBowsprit(true);
        yacht.setSLU(2);
        yacht.setSLE(0);
        yacht.setSFg(1.4);
        yacht.setTPS(1);
        yacht.setSMG(2);
        //Если спиннакер 3 то все подряд
        calculator.SPINcalc(yacht);
        assertEquals(yacht.getSPIN(), 1.0333, 0.0001);
    }

    @Test
    public void testSPIN4(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(2);
        //Если спиннакер 1
        yacht.setSL(0);
        yacht.setSPL1(0);
        yacht.setSFs(0);
        yacht.setJ(0);
        yacht.setSMW(0);
        yacht.setSPL(0);
        //Если спиннакер 2
        yacht.setBowsprit(false);
        yacht.setSLU(2);
        yacht.setSLE(0);
        yacht.setSFg(1.4);
        yacht.setTPS(1);
        yacht.setSMG(1.1);
        //Если спиннакер 3 то все подряд
        calculator.SPINcalc(yacht);
        assertEquals(yacht.getSPIN(), 0.8213, 0.0001);
    }


    @Test
    public void testSPIN5(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(3);
        //Если спиннакер 1
        yacht.setSL(2);
        yacht.setSPL1(2);
        yacht.setSFs(1);
        yacht.setJ(1);
        yacht.setSMW(3.62);
        //Если спиннакер 2
        yacht.setBowsprit(true);
        yacht.setSLU(20);
        yacht.setSLE(0);
        yacht.setSFg(1.4);
        yacht.setTPS(1);
        yacht.setSMG(2);
        yacht.setSPL(1);
        //Если спиннакер 3 то все подряд
        calculator.SPINcalc(yacht);
        assertEquals(yacht.getSPIN(), 39.7837, 0.0001);
    }


    @Test
    public void testSPIN6(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(3);
        //Если спиннакер 1
        yacht.setSL(2);
        yacht.setSPL1(2);
        yacht.setSFs(5.5);
        yacht.setJ(3);
        yacht.setSMW(2);
        //Если спиннакер 2
        yacht.setBowsprit(false);
        yacht.setSLU(2);
        yacht.setSLE(0);
        yacht.setSFg(1.4);
        yacht.setTPS(1);
        yacht.setSMG(2);
        yacht.setSPL(0.99);
        //Если спиннакер 3 то все подряд
        calculator.SPINcalc(yacht);
        assertEquals(yacht.getSPIN(), 5.3581, 0.0001);
    }


    @Test
    public void testSPIN7(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(3);
        //Если спиннакер 1
        yacht.setSL(2);
        yacht.setSPL1(1);
        yacht.setSFs(5.5);
        yacht.setJ(3);
        yacht.setSMW(3.62);
        yacht.setSPL(0);
        //Если спиннакер 2
        yacht.setBowsprit(false);
        yacht.setSLU(2);
        yacht.setSLE(0);
        yacht.setSFg(1.4);
        yacht.setTPS(1);
        yacht.setSMG(1.1);
        //Если спиннакер 3 то все подряд
        calculator.SPINcalc(yacht);
        assertEquals(yacht.getSPIN(), 5.3581, 0.0001);
    }

    @Test
    public void testSPIN8(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(3);
        //Если спиннакер 1
        yacht.setSL(2);
        yacht.setSPL1(0);
        yacht.setSFs(5.5);
        yacht.setJ(3);
        yacht.setSMW(3.62);
        yacht.setSPL(0);
        //Если спиннакер 2
        yacht.setBowsprit(false);
        yacht.setSLU(2);
        yacht.setSLE(0);
        yacht.setSFg(1.4);
        yacht.setTPS(1);
        yacht.setSMG(1.1);
        //Если спиннакер 3 то все подряд
        calculator.SPINcalc(yacht);
        assertEquals(yacht.getSPIN(), 5.3581, 0.0001);
    }


    @Test
    public void testS0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(1);

        yacht.setSAM(17.3750);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 17.3750, 0.0001);
    }

    @Test
    public void testS1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(2);
        
        yacht.setSAM(41.875);

        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 65.9083, 0.0001);
    }

    @Test
    public void testS2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(3);

        yacht.setSAM(41.875);
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 65.9083, 0.0001);
    }

    @Test
    public void testS3(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(4);

        yacht.setSAM(41.875);
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);

        yacht.setYSL(3);
        yacht.setYSLP(5);
        yacht.setYSMG(4);

        yacht.setMizzen_type(1);
        yacht.setPY(10);
        yacht.setEY(10);
        yacht.setHBY(0.5);
        yacht.setBY1(1);
        yacht.setBY2(1);
        yacht.setBY3(1);
        yacht.setBY4(1);
        yacht.setBY5(0);
        yacht.setGUY(2);
        yacht.setGMY(3);
        yacht.setGY(0);
        yacht.setTYL(0);
        yacht.setTYLP(0);
        yacht.setHY(0);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 107.7833, 0.0001);
    }

    @Test
    public void testS4(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(5);

        yacht.setSAM(41.875);
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);

        yacht.setYSL(3);
        yacht.setYSLP(5);
        yacht.setYSMG(4);

        yacht.setMizzen_type(1);
        yacht.setPY(10);
        yacht.setEY(10);
        yacht.setHBY(0.5);
        yacht.setBY1(1);
        yacht.setBY2(1);
        yacht.setBY3(1);
        yacht.setBY4(1);
        yacht.setBY5(0);
        yacht.setGUY(2);
        yacht.setGMY(3);
        yacht.setGY(0);
        yacht.setTYL(0);
        yacht.setTYLP(0);
        yacht.setHY(0);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 107.7833, 0.0001);
    }

    @Test
    public void testS5(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(6);

        yacht.setSAM(41.875);
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);

        yacht.setFok_type(1);
        yacht.setPSF(10);
        yacht.setEF(10);
        yacht.setHBF(0.5);
        yacht.setBF1(1);
        yacht.setBF2(1);
        yacht.setBF3(1);
        yacht.setBF4(1);
        yacht.setBF5(0);
        yacht.setGUF(2);
        yacht.setGMF(3);
        yacht.setHF(0);
        yacht.setGF(0);
        yacht.setTFL(0);
        yacht.setTFLP(0);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 107.7833, 0.0001);
    }

    @Test
    public void testS6(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(7);

        yacht.setSAM(41.875);
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);

        yacht.setFok_type(1);
        yacht.setPSF(10);
        yacht.setEF(10);
        yacht.setHBF(0.5);
        yacht.setBF1(1);
        yacht.setBF2(1);
        yacht.setBF3(1);
        yacht.setBF4(1);
        yacht.setBF5(0);
        yacht.setGUF(2);
        yacht.setGMF(3);
        yacht.setHF(0);
        yacht.setGF(0);
        yacht.setTFL(0);
        yacht.setTFLP(0);

        yacht.setMTL(4);
        yacht.setMTLP(4);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 115.7833, 0.0001);
    }

    @Test
    public void testS7(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(8);

        yacht.setSAM(41.875);
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);

        yacht.setEB(2);
        yacht.setPSF1(1.5);
        yacht.setIS(2.5);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 69.9083, 0.0001);
    }

    @Test
    public void testS8(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(9);

        yacht.setSAM(41.875);
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);

        yacht.setEB(2);
        yacht.setPSF1(1.5);
        yacht.setIS(2.5);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 69.9083, 0.0001);
    }


    @Test
    public void testS9(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(10);

        yacht.setSAM(41.875);

        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);

        yacht.setFok_type(1);
        yacht.setPSF(10);
        yacht.setEF(0.375);
        yacht.setHBF(0.15);
        yacht.setBF1(1);
        yacht.setBF2(1);
        yacht.setBF3(1);
        yacht.setBF4(1);
        yacht.setBF5(0);
        yacht.setGUF(2);
        yacht.setGMF(3);
        yacht.setHF(0);
        yacht.setGF(0);
        yacht.setTFL(0);
        yacht.setTFLP(0);
        yacht.setEFC(19.0);

        yacht.setRaffy(false);
        yacht.setRaffy_length(0);
        yacht.setHT(4);
        yacht.setMNWT(2);
        yacht.setMXWT(2);

        yacht.setMTL(4);
        yacht.setMTLP(4);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 97.2833, 0.0001);
    }

    @Test
    public void testS10(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setWeapon_type(11);

        yacht.setSAM(41.875);
        yacht.setJL(1);
        yacht.setJLI(2);
        yacht.setLP(3);
        yacht.setLPI(4);
        yacht.setFSP(3);
        yacht.setFSPI(2);
        yacht.setSpinnaker_type(1);
        yacht.setJ(1);
        yacht.setSPL(2);
        yacht.setSMW(3.62);
        yacht.setSMG(4);

        yacht.setRaffy(true);
        yacht.setRaffy_length(0);
        yacht.setPSF2(4);
        yacht.setMNWF(2);
        yacht.setMXWF(2);

        yacht.setMSL(2);
        yacht.setMSLP(4);

        yacht.setMTL(4);
        yacht.setMTLP(4);

        calculator.Scalc(yacht);
        assertEquals(yacht.getS(), 83.9083, 0.0001);
    }


    @Test
    public void testSC0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();

        yacht.setS(65.9083);
        yacht.setSPIN(3.4747);
        calculator.PSPINcalc(yacht);
        calculator.SCcalc(yacht);
        assertEquals(yacht.getSC(), 65.9083, 0.0004);
    }

    @Test
    public void testSC1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();

        yacht.setS(17.3750);
        yacht.setSPIN(39.7837);
        calculator.PSPINcalc(yacht);
        calculator.SCcalc(yacht);
        assertEquals(yacht.getSC(), 28.5793, 0.0004);
    }

    @Test
    public void testSPF0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(1);
        calculator.SPFcalc(yacht);
        assertEquals(yacht.getSPF(), 1.0000, 0.0001);
    }

    @Test
    public void testSPF1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(3);
        calculator.SPFcalc(yacht);
        assertEquals(yacht.getSPF(), 1.0000, 0.0001);
    }

    @Test
    public void testSPF2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setSpinnaker_type(2);
        calculator.SPFcalc(yacht);
        assertEquals(yacht.getSPF(), 0.8000, 0.0001);
    }


    @Test
    public void testNRP0(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setYEAR(2000);
        yacht.setLOA(6.7);
        yacht.setCabin_height(2);
        yacht.setBed_amount(2);
        yacht.setBed_length(2.1);
        yacht.setBed_type(1);
        yacht.setBed_width(0.8);
        calculator.NRPcalc(yacht);
        assertEquals(yacht.getNRP(), 3.0000, 0.0001);
    }

    @Test
    public void testNRP1(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setYEAR(2000);
        yacht.setLOA(8.8);
        yacht.setCabin_height(4);
        yacht.setBed_amount(2);
        yacht.setBed_length(2.1);
        yacht.setBed_type(1);
        yacht.setBed_width(1.1);
        calculator.NRPcalc(yacht);
        assertEquals(yacht.getNRP(), 1.5, 0.0001);
    }

    @Test
    public void testNRP2(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setYEAR(2000);
        yacht.setLOA(5);
        yacht.setCabin_height(1);
        yacht.setBed_amount(2);
        yacht.setBed_length(2.1);
        yacht.setBed_type(2);
        yacht.setBed_width(0.8);
        calculator.NRPcalc(yacht);
        assertEquals(yacht.getNRP(), 1.5, 0.0001);
    }

    @Test
    public void testNRP3(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setYEAR(2000);
        yacht.setLOA(8.8);
        yacht.setCabin_height(1.5);
        yacht.setBed_amount(5);
        yacht.setBed_length(1.8);
        yacht.setBed_type(2);
        yacht.setBed_width(0.5);
        calculator.NRPcalc(yacht);
        assertEquals(yacht.getNRP(), 4.5, 0.0001);
    }

    @Test
    public void testNRP4(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setYEAR(2000);
        yacht.setLOA(5);
        yacht.setCabin_height(1);
        yacht.setBed_amount(1);
        yacht.setBed_length(1.8);
        yacht.setBed_type(1);
        yacht.setBed_width(0.8);
        calculator.NRPcalc(yacht);
        assertEquals(yacht.getNRP(), 4.5000, 0.0001);
    }



    @Test
    public void testBWL(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setBMAX(8);
        yacht.setdB1(1);
        yacht.setdB2(1);
        calculator.BWLcalc(yacht);
        assertEquals(yacht.getBWL(), 6, 0.0001);
    }

    @Test
    public void testG(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setGMAX1(8);
        yacht.setFG1(1);
        yacht.setFG2(1);
        calculator.Gcalc(yacht);
        assertEquals(yacht.getG(), 6, 0.0001);
    }

    @Test
    public void testAGO(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setHA(0.5);
        yacht.setBWL(6);
        yacht.setG(6);
        yacht.setOHAT(1);
        calculator.AGOcalc(yacht);
        assertEquals(yacht.getAGO(), 0.2800, 0.0001);
    }

    @Test
    public void testL(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setLOA(6.7);
        yacht.setAGO(0.28);
        yacht.setFGO(1.22);
        calculator.Lcalc(yacht);
        assertEquals(yacht.getL(), 5.2000, 0.0001);
    }
    @Test
    public void testR(){
        Yacht yacht = new Yacht();
        Calculate calculator = new Calculate();
        yacht.setL(5.2);
        yacht.setG(6);
        yacht.setBWL(6);
        yacht.setRF(1);
        yacht.setSC(65.9083);
        yacht.setSPF(1);
        yacht.setPF(0.98);
        yacht.setNRP(3);
        calculator.Rcalc(yacht);
        assertEquals(yacht.getR(), 18.2060, 0.0001);
    }
}
