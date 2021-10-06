package DataStructures;

////////////////////////////////// THIS STUFF IS HINTS ABOUT IMPLEMENTING ARRAYLIST ////////////////////////////////////
//      At the core of your arraylist implementation there WILL BE A primitive array.
//    this works - our hack we avoid generics, instead using an array of Objects,
//     because all objects inherit eventually from Object class.
//    Object[] o = new Object[2];
//
//    this doesn't work, can't directly build an array of generics
//    E[] w = new E[2];
//
//    When we want to return our array, we would need to "cast" it like this "(Type) thing" we turn the thing into type.
//    public E[] getArray() {
//        return (E[]) o;
//    }
////////////////////////////////// THIS STUFF IS HINTS ABOUT IMPLEMENTING ARRAYLIST ///////////////////////////////////


import java.util.Arrays;

public class MyArrayList<T> implements MyListInterface<T>{

    int size;
    int maxSize;
    Object[] array;

    public MyArrayList() {
        this.size = 0;
        this.maxSize = 0;
        array = new Object[maxSize];
    }

    /**
     * Returns size of arrayList. Need to make sure it stays within the number of elements
     */
    @Override
    public int size() {
        return size();
    }

    /**
     * Adding an element to the arrayList
     */
    @Override
    public void add(T o) {
        for (int i = 0; i <= size; i++)
        {
            if(i == size)
            {
                array[i] = o;
            }
        }
        size++;
    }


    /**
     * Adding an item to some index within the arrayList, and shifting everything over to accommodate
     */
    @Override
    public void add(T o, int index) {

        for (int i = 0; i < size; i++)
        {
            if(i == index)
            {
                array[i] = o;
            }
        }
        size++;

    }

    /**
     * Return the element at the specified index
     */
    @Override
    public T get(int index) {
        Object o;
        o = array[index];
        return (T) o;
    }

    /**
     * Remove element at specified index, and shift the element so that it closes the gap left behind
     */
    @Override
    public void remove(int index) {

        for (int i = 0; i < size; i++)
        {
            if(i == index)
            {
                array[i] = null;
            }
        }
        size--;
    }

    /**
     * Clear all elements from array
     */
    @Override
    public void clear() {
        maxSize = 2;
        size = 0;
        array = new Object[maxSize];
    }

    /**
     * Check if collection contains this item and return the index of where said item is
     */
    @Override
    public int contains(T o) {
        int index = 0;
        //check each element;
        for (int i = 0; i < size; i++)
        {
            //if the element at i is equal to the object, set index equal to i
            if(array[i] == o)
            {
                index = i;
            }
        }
        return index;
    }


    /**
     * Doubles the size of the array list
     */
    private void growArray(){
        //This way copies array over to a new array manually
        /*
        Object[] temp = new Object[maxSize];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        */

        //This doubles the size of the array by using Array.copy to copy over the array
        maxSize *= 2;
        Object[] temp = Arrays.copyOf(array, maxSize * 2);
        array = temp;


    }

}
