package com.example.Fibonacci;

import org.springframework.stereotype.Component;

@Component
public class FibCalculator {
    private int n = 15;
    private String Fibo(){
        if(n == 2) return "2";
        if(n == 1) return "1";
        if(n == 0) return "0";
        if(n < 0) return "-1";
        String ans = "1 2";
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for(int i = 2; i < n; i++){
            arr[i] = arr[i-1] + arr[i-2];
            ans += " ";
            ans+= Integer.toString(arr[i]);
        }
        return ans;
    }
    public void setN(int parameter){
        n = parameter;
    }
    @Override
    public String toString(){
        return "The fibonacci sequence of " + n + " is: " + Fibo();
    }
}
