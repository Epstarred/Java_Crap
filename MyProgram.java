public class MyProgram {
    static public void main(String[] args){
        String s =  "This is some string";
        //String t = s.toUpper();
        String [] t = s.split(" ");
        System.out.println(t.length);
        int i = 0;
        while(i< t.length){
            if (t[i].length() >0) { //This takes care of the case where there is multiple spaces
                System.out.println(">>" + t[i] + "<<");
            }
            i++;
        }
    }
}
