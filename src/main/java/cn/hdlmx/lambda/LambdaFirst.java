package cn.hdlmx.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaFirst {
    public void test(){
        String[] atp={"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);
        //players.forEach((player)->System.out.println(player+";"));
        players.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new LambdaFirst().test();

}}
