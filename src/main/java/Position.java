public class Position {

    private enum typTransakcji {
        DOLARTOBITCOIN,
        DOLARTOETERIUM,
        DOLARTOEURO,
        DOLARTOGOLD,
        DOLARTOSILVER;
    }

    Wallet wallet = new Wallet();

    private double ratio;

    public double exchangeRatioValue() {

        switch (ratio) {

            case typTransakcji.DOLARTOBITCOIN:
                ratio = 0.00002;

                break;
            case typTransakcji.DOLARTOETERIUM:
                ratio = 0.0004;
                break;

            case typTransakcji.DOLARTOEURO:
                ratio = 0.8;
                break;

            case typTransakcji.DOLARTOGOLD:
                ratio = 0.0005;
                break;

            case typTransakcji.DOLARTOSILVER:
                ratio = 0.04;
                break;
            default:
                ratio = 1;

        }
        return ratio;
    }
        public void exchangeValue () {


            switch (typTransakcji) {

                case typTransakcji.DOLARTOBITCOIN:
                    wallet.getDolar() * exchangeRatioValue();

                    break;

                case typTransakcji.DOLARTOETERIUM:

                    wallet.getDolar() * exchangeRatio;

                    break;

                case typTransakcji.DOLARTOEURO:
                    wallet.getDolar() * exchangeRatio;
            }

        }


    }


}
