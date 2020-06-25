import com.sun.org.apache.xpath.internal.operations.Neg;

import java.util.Scanner;

public class Yacht {
    private double PSPIN;
    private double L;
    private double LOA;
    private double FGO;
    private double AGO;
    private double BWL;
    private double OHAT;
    private double HA;
    private double G;
    private double GMAX1;
    private double GMAX2;
    private double FS;
    private double dB1;
    private double dB2;
    private double BMAX;
    private double FG1;
    private double FG2;
    private double S;
    private double SAF;
    private double SL;
    private double SFCs;
    private double SFs;
    private double Spinnaker_type;
    private double RF;
    private double PF;
    private boolean Screw;
    private double Screw_type;
    private boolean Screw_InOut;
    private double Screw_cutout;
    private double Screw_speed;
    private double SAspin;
    private double SAgen;
    private double SPIN;
    private double SPL;
    private double P;
    private double E;
    private double EC;
    private double HB;
    private double PHB;
    private double PBL;
    private double BL1;
    private double BL2;
    private double BL3;
    private double BL4;
    private double BL5;
    private double MGU;
    private double MGM;
    private double Cave_Type;
    private double SAM;
    private double H;
    private double GM;
    private double MSAT;
    private double TL;
    private double TLP;
    private double Fok_type;
    private double PSF;
    private double PSF1;
    private double PSF2;
    private double EF;
    private double EFC;
    private double PBF;
    private double PHBF;
    private double HBF;
    private double BF1;
    private double BF2;
    private double BF3;
    private double BF4;
    private double BF5;
    private double GUF;
    private double GMF;
    private double SAG;
    private double HF;
    private double GF;
    private double TFL;
    private double TFLP;
    private double Mizzen_type;
    private double EY;
    private double PY;
    private double HY;
    private double GY;
    private double HBY;
    private double PBY;
    private double PHBY;
    private double GUY;
    private double GMY;
    private double EYC;
    private double SAY;
    private double MSATY;
    private double TYL;
    private double TYLP;
    private double MSATF;
    private double BY1;
    private double BY2;
    private double BY3;
    private double BY4;
    private double YSL;
    private double YSLP;
    private double YSMG;
    private double SAK;
    private double YSAC;
    private double EB;
    private double IS;
    private double Weapon_type;
    private double SQTSA;
    private double HT;
    private double MNWT;
    private double MXWT;
    private double MNWF;
    private double MXWF;
    private double SQSA;
    private double MSA;
    private double MSL;
    private double MSLP;
    private double MTSA;
    private double MTL;
    private double MTLP;
    private double SAB;
    private double BY5;
    private double JL;
    private double JLI;
    private double LP;
    private double LPI;
    private double FSP;
    private double FSPI;
    private double JC;
    private double J;
    private double SMW;
    private double SMG;
    private double SMWC;
    private double SLC;
    private double SLU;
    private double SPL1;
    private double SLE;
    private double SFCg;
    private double SFg;
    private double TPS;
    private boolean Bowsprit;
    private double SC;
    private double SMGC;
    private boolean Raffy;
    private double Cabin_height;
    private double Bed_amount;
    private double Bed_length;
    private double Bed_width;
    private double Bed_type;
    private double R;
    private double NRP;
    private double Raffy_length;
    private double YEAR;
    private double SPF;
    private String Temp;

    /**
     * все методы в данном классе являются методами get и set для соответствующих атрибутов
     */

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }

    public double getLOA() {
        return LOA;
    }

    public void setLOA(double LOA) {
        this.LOA = LOA;
    }

    public double getFGO() {
        return FGO;
    }

    public void setFGO(double FGO) {
        this.FGO = FGO;
    }

    public double getAGO() {
        return AGO;
    }

    public void setAGO(double AGO) {
        this.AGO = AGO;
    }

    public double getPSPIN() {
        return PSPIN;
    }

    public void setPSPIN(double PSPIN) {
        this.PSPIN = PSPIN;
    }

    public double getBWL() {
        return BWL;
    }

    public void setBWL(double BWL) {
        this.BWL = BWL;
    }

    public double getOHAT() {
        return OHAT;
    }

    public void setOHAT(double OHAT) {
        this.OHAT = OHAT;
    }

    public double getHA() {
        return HA;
    }

    public void setHA(double HA) {
        this.HA = HA;
    }

    public double getG() {
        return G;
    }

    public void setG(double g) {
        G = g;
    }

    public double getGMAX1() {
        return GMAX1;
    }

    public void setGMAX1(double GMAX1) {
        this.GMAX1 = GMAX1;
    }

    public double getGMAX2() {
        return GMAX2;
    }

    public void setGMAX2(double GMAX2) {
        this.GMAX2 = GMAX2;
    }

    public double getFS() {
        return FS;
    }

    public void setFS(double FS) {
        this.FS = FS;
    }

    public double getdB1() {
        return dB1;
    }

    public void setdB1(double dB1) {
        this.dB1 = dB1;
    }

    public double getdB2() {
        return dB2;
    }

    public void setdB2(double dB2) {
        this.dB2 = dB2;
    }

    public double getBMAX() {
        return BMAX;
    }

    public void setBMAX(double BMAX) {
        this.BMAX = BMAX;
    }

    public double getFG1() {
        return FG1;
    }

    public void setFG1(double FG1) {
        this.FG1 = FG1;
    }

    public double getFG2() {
        return FG2;
    }

    public void setFG2(double FG2) {
        this.FG2 = FG2;
    }

    public double getS() {
        return S;
    }

    public void setS(double s) {
        S = s;
    }

    public double getSAF() {
        return SAF;
    }

    public void setSAF(double SAF) {
        this.SAF = SAF;
    }

    public double getSL() {
        return SL;
    }

    public void setSL(double SL) {
        this.SL = SL;
    }

    public double getSFCs() {
        return SFCs;
    }

    public void setSFCs(double SFCs) {
        this.SFCs = SFCs;
    }

    public double getSFs() {
        return SFs;
    }

    public void setSFs(double SFs) {
        this.SFs = SFs;
    }

    public double getSpinnaker_type() {
        return Spinnaker_type;
    }

    public void setSpinnaker_type(double spinnaker_type) {
        Spinnaker_type = spinnaker_type;
    }

    public double getRF() {
        return RF;
    }

    public void setRF(double RF) {
        this.RF = RF;
    }

    public double getPF() {
        return PF;
    }

    public void setPF(double PF) {
        this.PF = PF;
    }

    public boolean isScrew() {
        return Screw;
    }

    public void setScrew(boolean screw) {
        Screw = screw;
    }

    public double getScrew_type() {
        return Screw_type;
    }

    public void setScrew_type(double screw_type) {
        Screw_type = screw_type;
    }

    public boolean isScrew_InOut() {
        return Screw_InOut;
    }

    public void setScrew_InOut(boolean screw_InOut) {
        Screw_InOut = screw_InOut;
    }

    public double getScrew_cutout() {
        return Screw_cutout;
    }

    public void setScrew_cutout(double screw_cutout) {
        Screw_cutout = screw_cutout;
    }

    public double getScrew_speed() {
        return Screw_speed;
    }

    public void setScrew_speed(double screw_speed) {
        Screw_speed = screw_speed;
    }

    public double getSAspin() {
        return SAspin;
    }

    public void setSAspin(double SAspin) {
        this.SAspin = SAspin;
    }

    public double getSAgen() {
        return SAgen;
    }

    public void setSAgen(double SAgen) {
        this.SAgen = SAgen;
    }

    public double getSPIN() {
        return SPIN;
    }

    public void setSPIN(double SPIN) {
        this.SPIN = SPIN;
    }

    public double getSPL() {
        return SPL;
    }

    public void setSPL(double SPL) {
        this.SPL = SPL;
    }

    public double getP() {
        return P;
    }

    public void setP(double p) {
        P = p;
    }

    public double getE() {
        return E;
    }

    public void setE(double e) {
        E = e;
    }

    public double getEC() {
        return EC;
    }

    public void setEC(double EC) {
        this.EC = EC;
    }

    public double getHB() {
        return HB;
    }

    public void setHB(double HB) {
        this.HB = HB;
    }

    public double getPHB() {
        return PHB;
    }

    public void setPHB(double PHB) {
        this.PHB = PHB;
    }

    public double getPBL() {
        return PBL;
    }

    public void setPBL(double PBL) {
        this.PBL = PBL;
    }

    public double getBL1() {
        return BL1;
    }

    public void setBL1(double BL1) {
        this.BL1 = BL1;
    }

    public double getBL2() {
        return BL2;
    }

    public void setBL2(double BL2) {
        this.BL2 = BL2;
    }

    public double getBL3() {
        return BL3;
    }

    public void setBL3(double BL3) {
        this.BL3 = BL3;
    }

    public double getBL4() {
        return BL4;
    }

    public void setBL4(double BL4) {
        this.BL4 = BL4;
    }

    public double getBL5() {
        return BL5;
    }

    public void setBL5(double BL5) {
        this.BL5 = BL5;
    }

    public double getMGU() {
        return MGU;
    }

    public void setMGU(double MGU) {
        this.MGU = MGU;
    }

    public double getMGM() {
        return MGM;
    }

    public void setMGM(double MGM) {
        this.MGM = MGM;
    }

    public double getCave_Type() {
        return Cave_Type;
    }

    public void setCave_Type(double cave_Type) {
        Cave_Type = cave_Type;
    }

    public double getSAM() {
        return SAM;
    }

    public void setSAM(double SAM) {
        this.SAM = SAM;
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    public double getGM() {
        return GM;
    }

    public void setGM(double GM) {
        this.GM = GM;
    }

    public double getMSAT() {
        return MSAT;
    }

    public void setMSAT(double MSAT) {
        this.MSAT = MSAT;
    }

    public double getTL() {
        return TL;
    }

    public void setTL(double TL) {
        this.TL = TL;
    }

    public double getTLP() {
        return TLP;
    }

    public void setTLP(double TLP) {
        this.TLP = TLP;
    }

    public double getFok_type() {
        return Fok_type;
    }

    public void setFok_type(double fok_type) {
        Fok_type = fok_type;
    }

    public double getPSF() {
        return PSF;
    }

    public void setPSF(double PSF) {
        this.PSF = PSF;
    }

    public double getPSF1() {
        return PSF1;
    }

    public void setPSF1(double PSF1) {
        this.PSF1 = PSF1;
    }

    public double getPSF2() {
        return PSF2;
    }

    public void setPSF2(double PSF2) {
        this.PSF2 = PSF2;
    }

    public double getEF() {
        return EF;
    }

    public void setEF(double EF) {
        this.EF = EF;
    }

    public double getEFC() {
        return EFC;
    }

    public void setEFC(double EFC) {
        this.EFC = EFC;
    }

    public double getPBF() {
        return PBF;
    }

    public void setPBF(double PBF) {
        this.PBF = PBF;
    }

    public double getPHBF() {
        return PHBF;
    }

    public void setPHBF(double PHBF) {
        this.PHBF = PHBF;
    }

    public double getHBF() {
        return HBF;
    }

    public void setHBF(double HBF) {
        this.HBF = HBF;
    }

    public double getBF1() {
        return BF1;
    }

    public void setBF1(double BF1) {
        this.BF1 = BF1;
    }

    public double getBF2() {
        return BF2;
    }

    public void setBF2(double BF2) {
        this.BF2 = BF2;
    }

    public double getBF3() {
        return BF3;
    }

    public void setBF3(double BF3) {
        this.BF3 = BF3;
    }

    public double getBF4() {
        return BF4;
    }

    public void setBF4(double BF4) {
        this.BF4 = BF4;
    }

    public double getBF5() {
        return BF5;
    }

    public void setBF5(double BF5) {
        this.BF5 = BF5;
    }

    public double getGUF() {
        return GUF;
    }

    public void setGUF(double GUF) {
        this.GUF = GUF;
    }

    public double getGMF() {
        return GMF;
    }

    public void setGMF(double GMF) {
        this.GMF = GMF;
    }

    public double getSAG() {
        return SAG;
    }

    public void setSAG(double SAG) {
        this.SAG = SAG;
    }

    public double getHF() {
        return HF;
    }

    public void setHF(double HF) {
        this.HF = HF;
    }

    public double getGF() {
        return GF;
    }

    public void setGF(double GF) {
        this.GF = GF;
    }

    public double getTFL() {
        return TFL;
    }

    public void setTFL(double TFL) {
        this.TFL = TFL;
    }

    public double getTFLP() {
        return TFLP;
    }

    public void setTFLP(double TFLP) {
        this.TFLP = TFLP;
    }

    public double getMizzen_type() {
        return Mizzen_type;
    }

    public void setMizzen_type(double mizzen_type) {
        Mizzen_type = mizzen_type;
    }

    public double getEY() {
        return EY;
    }

    public void setEY(double EY) {
        this.EY = EY;
    }

    public double getPY() {
        return PY;
    }

    public void setPY(double PY) {
        this.PY = PY;
    }

    public double getHY() {
        return HY;
    }

    public void setHY(double HY) {
        this.HY = HY;
    }

    public double getGY() {
        return GY;
    }

    public void setGY(double GY) {
        this.GY = GY;
    }

    public double getHBY() {
        return HBY;
    }

    public void setHBY(double HBY) {
        this.HBY = HBY;
    }

    public double getPBY() {
        return PBY;
    }

    public void setPBY(double PBY) {
        this.PBY = PBY;
    }

    public double getPHBY() {
        return PHBY;
    }

    public void setPHBY(double PHBY) {
        this.PHBY = PHBY;
    }

    public double getGUY() {
        return GUY;
    }

    public void setGUY(double GUY) {
        this.GUY = GUY;
    }

    public double getGMY() {
        return GMY;
    }

    public void setGMY(double GMY) {
        this.GMY = GMY;
    }

    public double getEYC() {
        return EYC;
    }

    public void setEYC(double EYC) {
        this.EYC = EYC;
    }

    public double getSAY() {
        return SAY;
    }

    public void setSAY(double SAY) {
        this.SAY = SAY;
    }

    public double getMSATY() {
        return MSATY;
    }

    public void setMSATY(double MSATY) {
        this.MSATY = MSATY;
    }

    public double getTYL() {
        return TYL;
    }

    public void setTYL(double TYL) {
        this.TYL = TYL;
    }

    public double getTYLP() {
        return TYLP;
    }

    public void setTYLP(double TYLP) {
        this.TYLP = TYLP;
    }

    public double getMSATF() {
        return MSATF;
    }

    public void setMSATF(double MSATF) {
        this.MSATF = MSATF;
    }

    public double getBY1() {
        return BY1;
    }

    public void setBY1(double BY1) {
        this.BY1 = BY1;
    }

    public double getBY2() {
        return BY2;
    }

    public void setBY2(double BY2) {
        this.BY2 = BY2;
    }

    public double getBY3() {
        return BY3;
    }

    public void setBY3(double BY3) {
        this.BY3 = BY3;
    }

    public double getBY4() {
        return BY4;
    }

    public void setBY4(double BY4) {
        this.BY4 = BY4;
    }

    public double getYSL() {
        return YSL;
    }

    public void setYSL(double YSL) {
        this.YSL = YSL;
    }

    public double getYSLP() {
        return YSLP;
    }

    public void setYSLP(double YSLP) {
        this.YSLP = YSLP;
    }

    public double getYSMG() {
        return YSMG;
    }

    public void setYSMG(double YSMG) {
        this.YSMG = YSMG;
    }

    public double getSAK() {
        return SAK;
    }

    public void setSAK(double SAK) {
        this.SAK = SAK;
    }

    public double getYSAC() {
        return YSAC;
    }

    public void setYSAC(double YSAC) {
        this.YSAC = YSAC;
    }

    public double getEB() {
        return EB;
    }

    public void setEB(double EB) {
        this.EB = EB;
    }

    public double getIS() {
        return IS;
    }

    public void setIS(double IS) {
        this.IS = IS;
    }

    public double getWeapon_type() {
        return Weapon_type;
    }

    public void setWeapon_type(double weapon_type) {
        Weapon_type = weapon_type;
    }

    public double getSQTSA() {
        return SQTSA;
    }

    public void setSQTSA(double SQTSA) {
        this.SQTSA = SQTSA;
    }

    public double getHT() {
        return HT;
    }

    public void setHT(double HT) {
        this.HT = HT;
    }

    public double getMNWT() {
        return MNWT;
    }

    public void setMNWT(double MNWT) {
        this.MNWT = MNWT;
    }

    public double getMXWT() {
        return MXWT;
    }

    public void setMXWT(double MXWT) {
        this.MXWT = MXWT;
    }

    public double getMNWF() {
        return MNWF;
    }

    public void setMNWF(double MNWF) {
        this.MNWF = MNWF;
    }

    public double getMXWF() {
        return MXWF;
    }

    public void setMXWF(double MXWF) {
        this.MXWF = MXWF;
    }

    public double getSQSA() {
        return SQSA;
    }

    public void setSQSA(double SQSA) {
        this.SQSA = SQSA;
    }

    public double getMSA() {
        return MSA;
    }

    public void setMSA(double MSA) {
        this.MSA = MSA;
    }

    public double getMSL() {
        return MSL;
    }

    public void setMSL(double MSL) {
        this.MSL = MSL;
    }

    public double getMSLP() {
        return MSLP;
    }

    public void setMSLP(double MSLP) {
        this.MSLP = MSLP;
    }

    public double getMTSA() {
        return MTSA;
    }

    public void setMTSA(double MTSA) {
        this.MTSA = MTSA;
    }

    public double getMTL() {
        return MTL;
    }

    public void setMTL(double MTL) {
        this.MTL = MTL;
    }

    public double getMTLP() {
        return MTLP;
    }

    public void setMTLP(double MTLP) {
        this.MTLP = MTLP;
    }

    public double getSAB() {
        return SAB;
    }

    public void setSAB(double SAB) {
        this.SAB = SAB;
    }

    public double getBY5() {
        return BY5;
    }

    public void setBY5(double BY5) {
        this.BY5 = BY5;
    }

    public double getJL() {
        return JL;
    }

    public void setJL(double JL) {
        this.JL = JL;
    }

    public double getJLI() {
        return JLI;
    }

    public void setJLI(double JLI) {
        this.JLI = JLI;
    }

    public double getLP() {
        return LP;
    }

    public void setLP(double LP) {
        this.LP = LP;
    }

    public double getLPI() {
        return LPI;
    }

    public void setLPI(double LPI) {
        this.LPI = LPI;
    }

    public double getFSP() {
        return FSP;
    }

    public void setFSP(double FSP) {
        this.FSP = FSP;
    }

    public double getFSPI() {
        return FSPI;
    }

    public void setFSPI(double FSPI) {
        this.FSPI = FSPI;
    }

    public double getJC() {
        return JC;
    }

    public void setJC(double JC) {
        this.JC = JC;
    }

    public double getJ() {
        return J;
    }

    public void setJ(double j) {
        J = j;
    }

    public double getSMW() {
        return SMW;
    }

    public void setSMW(double SMW) {
        this.SMW = SMW;
    }

    public double getSMG() {
        return SMG;
    }

    public void setSMG(double SMG) {
        this.SMG = SMG;
    }

    public double getSMWC() {
        return SMWC;
    }

    public void setSMWC(double SMWC) {
        this.SMWC = SMWC;
    }

    public double getSLC() {
        return SLC;
    }

    public void setSLC(double SLC) {
        this.SLC = SLC;
    }

    public double getSLU() {
        return SLU;
    }

    public void setSLU(double SLU) {
        this.SLU = SLU;
    }

    public double getSPL1() {
        return SPL1;
    }

    public void setSPL1(double SPL1) {
        this.SPL1 = SPL1;
    }

    public double getSLE() {
        return SLE;
    }

    public void setSLE(double SLE) {
        this.SLE = SLE;
    }

    public double getSFCg() {
        return SFCg;
    }

    public void setSFCg(double SFCg) {
        this.SFCg = SFCg;
    }

    public double getSFg() {
        return SFg;
    }

    public void setSFg(double SFg) {
        this.SFg = SFg;
    }

    public double getTPS() {
        return TPS;
    }

    public void setTPS(double TPS) {
        this.TPS = TPS;
    }

    public boolean isBowsprit() {
        return Bowsprit;
    }

    public void setBowsprit(boolean bowsprit) {
        Bowsprit = bowsprit;
    }

    public double getSC() {
        return SC;
    }

    public void setSC(double SC) {
        this.SC = SC;
    }

    public double getSMGC() {
        return SMGC;
    }

    public void setSMGC(double SMGC) {
        this.SMGC = SMGC;
    }

    public boolean isRaffy() {
        return Raffy;
    }

    public void setRaffy(boolean raffy) {
        Raffy = raffy;
    }

    public double getCabin_height() {
        return Cabin_height;
    }

    public void setCabin_height(double cabin_height) {
        Cabin_height = cabin_height;
    }

    public double getBed_amount() {
        return Bed_amount;
    }

    public void setBed_amount(double bed_amount) {
        Bed_amount = bed_amount;
    }

    public double getBed_length() {
        return Bed_length;
    }

    public void setBed_length(double bed_length) {
        Bed_length = bed_length;
    }

    public double getBed_width() {
        return Bed_width;
    }

    public void setBed_width(double bed_width) {
        Bed_width = bed_width;
    }

    public double getBed_type() {
        return Bed_type;
    }

    public void setBed_type(double bed_type) {
        Bed_type = bed_type;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public double getNRP() {
        return NRP;
    }

    public void setNRP(double NRP) {
        this.NRP = NRP;
    }

    public double getRaffy_length() {
        return Raffy_length;
    }

    public void setRaffy_length(double raffy_length) {
        Raffy_length = raffy_length;
    }

    public double getYEAR() {
        return YEAR;
    }

    public void setYEAR(double YEAR) {
        this.YEAR = YEAR;
    }

    public double getSPF() {
        return SPF;
    }

    public void setSPF(double SPF) {
        this.SPF = SPF;
    }

    public String getTemp() {
        return Temp;
    }

    public void setTemp(String temp) {
        Temp = temp;
    }

    /* public void setFGO(Scanner sc){
        this.FGO = sc.nextDouble();
        try {
            if(this.FGO < 0)
            {
                throw new NegativeException();
            }
        }
        catch(NegativeException ex)
        {
            System.out.println("Ошибка! Дина носового свеса не может быть меньше нуля. Попробуйте ещё раз:");
            setFGO(sc);
        }
    }
    */



}
