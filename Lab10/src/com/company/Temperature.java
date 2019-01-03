package com.company;

public class Temperature {
    double temp;
    char scale;

    public Temperature() { // default constructor

        temp = 0;
        scale = 'N';
    }

    public Temperature(char scale) { // this constructor takes a char
        this.scale = scale;
        temp = 0;
    }

    public Temperature(double temp) { // this constructor takes the double temp
        this.temp = temp;
        scale = 'N';
    }

    public Temperature( double temp, char scale){ // this constructor takes in two values
        this.temp = temp;
        this.scale = scale;
    }

    public int compareTo(Temperature obj) {
        if (getCelsius() < obj.getCelsius())
            return -1;
        if (getCelsius() > obj.getCelsius()) {
            return 1;
        } else {
            return 0;
        }
    }
    public String toString() { // this overrides the other method
        if(getScale()=='C') {
            return String.format("%.1f degrees C = %.1f degrees F", getTemperature(), getFahrenheit());
        }else {
            return String.format("%.1f degrees F = %.1f degrees C", getTemperature(), getCelsius());
        }
    }

    public double getTemperature() { // getter
        return temp;
    }

    public char getScale() { // getter
        return scale;
    }

    public double getFahrenheit() { // getter
        if (scale == 'F')
            return temp;
        else
            return (Math.round((9*(temp/5) + 32)*10)/10);
    }

    public double getCelsius() { // getter
        if (scale == 'C')
            return temp;
        else
            return  ((double)(Math.round((5*(temp - 32.0)/9.0)*10.0))/10); // Math formula to convert from f to c
    }

    public void setTemp(double temp) { // setter
        this.temp = temp;
    }

    public void setScale(char scale) { // getter
        this.scale = scale;
    }

    public void setTempScale(double temp, char scale) { // setter
        this.temp = temp;
        this.scale = scale;
    }

}