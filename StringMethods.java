class StringMethods {
    public static void main(String[] args) {
        String java = "Java is Cool";
        
        System.out.println(java.charAt(10)+" "+java.charAt(0)+" "+java.charAt(5));
        System.out.println(java.contains("is")+", "+java.contains("Cool"));
        System.out.println(java.equals("JAVA IS COOL")+", "+java.equalsIgnoreCase("JAVA IS COOL"));
        System.out.println(java.indexOf('o')+", "+java.indexOf("a",3));
        System.out.println(java.replace("J","K"));
        System.out.println(java.startsWith("J")+", "+java.endsWith("L"));
        System.out.println(java.substring(2)+", "+java.substring(0,4));
        System.out.println(java.toLowerCase()+", "+java.toUpperCase());
        System.out.println(java.trim());
        System.out.println(java.trim().toUpperCase().replace("o","--"));
    
        StringBuilder str = new StringBuilder("java is");
        System.out.println(str.append(" cool ")); 
        System.out.println(str.delete(0,1)); 
        System.out.println(str.deleteCharAt(0)); 
        System.out.println(str.insert(0, "Ka")); 
        System.out.println(str.reverse()); 
        System.out.println(str.toString());

        
        
    }
}

