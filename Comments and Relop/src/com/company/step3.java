package com.company;

public class step3 {
    public void reLop(String ch, boolean x){
        int a=0;
        int b=1;
        if(ch.charAt(a) == '<'){
            if(x==true){
                if(ch.charAt(b) == '='){
                    System.out.println(ch.charAt(a)+""+ch.charAt(b)+" relop LE");
                }else if(ch.charAt(b) == '>'){
                    System.out.println(ch.charAt(a)+""+ch.charAt(b)+" relop NE");
                }
            }else{
                System.out.println(ch.charAt(a)+" relop LT");
            }
        }
        else if(ch.charAt(a) == '>'){
            if(x==true){
                if(ch.charAt(b) == '='){
                    System.out.println(ch.charAt(a)+""+ch.charAt(b)+" relop GE");
                }
            }else{
                System.out.println(ch.charAt(a)+" relop GT");
            }
        }//==
        else if(ch.charAt(a) == '='){
            if(x==true){
                if(ch.charAt(b) == '='){
                    System.out.println(ch.charAt(a)+""+ch.charAt(b)+" relop EQ");
                }
            }else{
                System.out.println("error");
            }
        }


    }
}
