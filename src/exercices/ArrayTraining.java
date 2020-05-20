public class ArrayTraining {

    /**
     * @param n size of the array, eg: 3
     * @return an empty int array of size n, eg: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {
        int[] array = new int[n];

        return array;
    }

    /**
     * @param n size of the array, eg: 2
     * @return an empty String array of size n, eg: {null, null}
     */
    public String[] emptyStringArray(int n) {
        String[] array = new String[n];

        return array;
    }

    /**
     * @param a first value, eg: 3
     * @param b second value, eg: 2
     * @param c third value, eg: 1
     * @return an int array with a, b and c values, eg: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {
        int[] array = {a,b,c};

        return array;
    }

    /**
     * @param a first value, eg: "test"
     * @param b second value, eg: "sample"
     * @param c third value, eg: "value"
     * @return a String array with a, b and c values,
     * eg: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {
        String[] array = {a,b,c};

        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return length of the array, eg: 1
     */
    public int length(int[] array) {
        return array.length;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return first value of the array, eg: 3
     */
    public int firstValue(int[] array) {
        if ( array.length > 0) {
            return array[0];
        } else {
            return -1;
        }
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return last value of the array, eg: 1
     */
    public int lastValue(int[] array) {
        if ( array.length > 0) {
            return array[array.length-1];
        } else {
            return -1;
        }
    }

    /**
     * @param array,    eg: {3, 2, 1}
     * @param position, eg: 1
     * @return value of the array at position, eg: 2
     */
    public int valueAtPosition(int[] array, int position) {
        if ( array.length > 0 && array.length > position) {
            return array[position];
        } else {
            return -1;
        }
    }

    /**
     * @param array,    eg: {3, 8, 5}
     * @param value,    eg: 4
     * @param position, eg: 1
     * @return the array with the value replaced at position, eg: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {
        if ( array.length > 0 && array.length > position) {
            array[position] = value;
        }
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return sum of values of the array, eg: 6
     */
    public int sum(int[] array) {
        int sum = 0;

        for(int i : array){
            sum += i;
        }
        return sum;
    }

    /**
     * @param array,  eg: {1, 2, 3}
     * @param search, eg: 2
     * @return if array contains searched value, eg: true
     */
    public boolean contains(int[] array, int search) {
        boolean finded = false;
        int imax = array.length;
        int i=0;

        while ( i<imax && !finded ) {
            if ( array[i] == search ) { finded = true; }
            i++;
        }

        return finded;
    }

    /**
     * @param array, eg: {"sample", "value"}
     * @return array where all words are capitalized, eg: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {
        String[] capitalized = new String[array.length];

        for (int i=0;i<array.length;i++) {
            capitalized[i] = array[i].substring(0,1).toUpperCase() + array[i].substring(1);
        }

        return capitalized;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {3, 2, 1}
     * @return if values in first and second arrays, in the same position,
     * are equals, eg: false
     */
    public boolean equals(int[] first, int[] second) {
        boolean equal = true;
        int imax = first.length;
        int i=0;

        if ( first.length != second.length ) { return false;}
        while ( i<imax && equal ) {
            if ( first[i] != second[i] ) { equal = false; }
            i++;
        }

        return equal;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return array with reversed values, eg: {3, 2, 1}
     */
    public int[] reverse(int[] array) {
        int[] arrayReverse = new int[array.length];
        int j = array.length-1;

        for (int i=0;i<array.length;i++) {
            arrayReverse[j] = array[i];
            j--;
        }

        return arrayReverse;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {4, 5}
     * @return concatenates first and second values in one array,
     * eg: {1, 2, 3, 4, 5}
     */
    public int[] concat(int[] first, int[] second) {
        int[] third = new int[first.length+second.length];

        for (int i=0;i<first.length;i++) {
            third[i] = first[i];
        }
        for (int i=0;i<second.length;i++) {
            third[i+first.length] = second[i];
        }

        return third;
    }
}
