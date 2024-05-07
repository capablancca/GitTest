import java.util.*;
//import java.util.ArrayList;
public class Main {

    public static List<String> res;
    public static void fun(String result, List<Character> t){
        if(t.size()==0){
            res.add(result);
            return;
        }

        for(int i=0;i<t.size();i++){
            char c = t.get(i);
            t.remove(i);
            fun(result+c,t);
            t.add(i,c);
        }
    }

    public static void helper(String s, char ch){

        List<Character> t = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(c!=ch)
            t.add(c);
        }
        fun(""+ch,t);

    }

    public static void main(String[] args) {

        res = new ArrayList<String>();
        String s = "ABC";
        Character startingChar = s.charAt(0);

        //fun("",t, startingChar);
        helper(s,startingChar);
        for(String str : res){
            System.out.println(str);
        }
    }


}
