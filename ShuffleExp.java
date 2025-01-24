import java.util.*;
class Arraylist{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
            al.add("Black");
            al.add("Blue");
            al.add("Pink");
            al.add("Green");
            //Collections.shuffle(al);
            Collections.reverse(al);
            System.out.print(al);
    }
}