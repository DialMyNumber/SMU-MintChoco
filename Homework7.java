public class Homework7 {
    abstract static class Printer {
        String model;
        int availableCount;
        int printedCount;
        abstract boolean print();

        public Printer(String im, int ia) {}
        public Printer(String m, int a, int p) {
            model = m;
            availableCount = a;
            printedCount = p;
        }
        String getModel() {
            return model;
        }
        int getAvailableCount() {
            return availableCount;
        }
        int getPrintedCount() {
            return printedCount;
        }
    }

    static class InkjetPrinter extends Printer {
        public InkjetPrinter(String im, int ia) {
            super(im, ia);
        }

        @Override
        public boolean print() {
            for (int i = 0; i<100000; i++) {
                if (availableCount > 1) {
                    printedCount++;
                    availableCount--;
                    return true;
                } else if (availableCount == 0) {
                    System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 잉크 부족.");
                    return false;
                }
            }
            return false;
        }
    }

    static class LaserPrinter extends Printer {
        public LaserPrinter(String lm, int la) {
            super(lm, la);
        }

        @Override
        public boolean print() {
            if(availableCount>1) {
                printedCount++;
                availableCount--;
            }
            else if(availableCount==0) {
                System.out.println(getModel()+": "+(getPrintedCount()+1)+"매째 인쇄 실패 - 토너 부족.");
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Cannon MFC643Cdw", 1500);
        while(inkjet.print()) {
            break;
        }
        while(laser.print()) {
            break;
        }
    }
}