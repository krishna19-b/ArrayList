import java.util.*;
class SwapArrayList{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
            al.add("Black");
            al.add("Blue");
            al.add("Pink");
            al.add("Green");
            ArrayList<String> al1= (ArrayList<String>)al.clone();
            System.out.println("Original:"+al);
            System.out.print(al1);
    }
}