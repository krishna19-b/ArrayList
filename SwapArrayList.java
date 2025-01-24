import java.util.*;
class SwapArrayList{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
            al.add("Black");
            al.add("Blue");
            al.add("Pink");
            al.add("Green");
            //Collections.shuffle(al);
            String temp=al.get(0);
            al.set(0,al.get(3));
            al.set(3,temp);
            System.out.print(al);
    }
}