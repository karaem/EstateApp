package com.example.estateapp.Java;
public class Property {


        private String name;
        private int imageRes;

        public Property(String name, int imageRes) {
            this.name = name;
            this.imageRes = imageRes;
        }

        public String getName() {
            return name;
        }

        public int getImageRes() {
            return imageRes;
        }
}
