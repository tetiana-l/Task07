package Task07;

public enum Color {
    RED("ff0000"),
    GREEN(0, 128, 0),
    BLUE("0000ff"),
    WHITE(255, 255, 255),
    BLACK(0, 0, 0);

    private final String hex;
    private final int r;
    private final int g;
    private final int b;

    @Override
    public String toString() {
        return "Color { " + name() + ":  " +
                "hex = '" + hex + '\'' +
                ", RGB = " + "(" + r + "," + g + "," + b + ")" + " }";
    }

    Color(String hex) {
        this.hex = hex;
        this.r = hexToDecimal(hex.substring(0, 2));
        this.g = hexToDecimal(hex.substring(2, 4));
        this.b = hexToDecimal(hex.substring(4));
    }

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.hex = decimalToHex(r) + decimalToHex(g) + decimalToHex(b);
    }

    private String decimalToHex(int num) {
        String result = Integer.toHexString(num);
        if (num < 16) {
            result = "0" + result;
        }
        return result;
    }

    private int hexToDecimal(String hex) {
        String hexString = "0123456789abcdef";
        int number = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int n = hexString.indexOf(c);
            number = 16 * number + n;
        }
        return number;
    }
}
