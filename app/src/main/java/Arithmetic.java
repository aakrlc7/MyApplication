
package com.myfirstapp;

public class Arithmetic {

        //properties
        private int first;
        private int second;

        //constructor
        public Arithmetic(int first,int second) {
            this.first = first;
            this.second = second;
        }
        //behaviour
        public int add(){
            return first + second;
        }
        //getset
        public int getFirst() {
            return first;
        }

        public void setFirst(int first) {
            this.first = first;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }
    }


