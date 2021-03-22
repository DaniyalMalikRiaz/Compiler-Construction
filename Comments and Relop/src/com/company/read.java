package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {
    step3 st = new step3();

    public void readFromFile(){
        try {
            File fl = new File("D:\\Imran\\Desktop\\input.txt");
            Scanner sc = new Scanner(fl);

            while (sc.hasNextLine()) {
                String ln = sc.nextLine();
                ln = comments1(ln);
                for (int i=0; i<ln.length(); i++){
                    boolean b=false;
                    char c = ln.charAt(i);
                    System.out.println(c);

                    if(c =='<' || c =='>' || c =='='){              //recognize relop
                        //String s=String.valueOf(c);
                        if(ln.length() > 1){
                           // s += ln.charAt(1);
                            b=true;
                        }
                        st.reLop(ln,b);
                    }
                }

            }
            sc.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String comments1(String ln){

        ln = ln.replaceAll(
                "(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)", "");
        ln = ln.replaceAll("[\\n\\t ]", "");
        ln = comments2(ln);
        //System.out.println(fileString);
        return ln;
    }

    public String comments2(String ln) {

        if (ln.startsWith("//")) {
            return "";
        } else if (ln.contains("//")) {
            if (ln.contains("\"")) {
                int lastIndex = ln.lastIndexOf("\"");
                int lastIndexComment = ln.lastIndexOf("//");
                if (lastIndexComment > lastIndex) { // ( "" // )
                    ln = ln.substring(0, lastIndexComment);
                }
            } else {
                int index = ln.lastIndexOf("//");
                ln = ln.substring(0, index);
            }
        }

        return ln;
    }



}
