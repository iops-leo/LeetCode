class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int real1 = Integer.parseInt(num1.split("\\+")[0]);
        int real2 = Integer.parseInt(num2.split("\\+")[0]);
        String imaginary1 = num1.split("\\+")[1];
        String imaginary2 = num2.split("\\+")[1];
        int real = (real1*real2)+((Integer.parseInt(imaginary1.split("i")[0])*Integer.parseInt(imaginary2.split("i")[0]))*-1);
        int img = (real1*(Integer.parseInt(imaginary2.split("i")[0])))+(real2*(Integer.parseInt(imaginary1.split("i")[0])));
        return real+"+"+img+"i";
    }
}