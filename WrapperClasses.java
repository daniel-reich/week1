class WrapperClasses {
    public static void main(String[] args) {
        String str="1";
        
        byte strByte=Byte.parseByte(str);
        short strShort=Short.parseShort(str);
        int strInt=Integer.parseInt(str);
        long strLong=Long.parseLong(str);
        float strFloat=Float.parseFloat(str);
        double strDouble=Double.parseDouble(str);
        boolean strBoolean=Boolean.parseBoolean(str);
        char strChar=str.charAt(0);
    }
}
