package DataStructures;

public interface MyListInterface<E>{

    /**
     * Custom interface used to implement the data structure for my array list
     */

        //Returns size of arrayList. Need to make sure it stays within the number of elements
        int size();

        //Adding an element to the arrayList
        void add(E e);

        //Adding an item to some index within the arrayList, and shifting everything over to accommodate
        void add(E e, int index);

        //Return the element at the specified index
        E get(int index);

        //Remove element at specified index, and shift the element so that it closes the gap left behind
        void remove(int index);

        //Remove all elements from the collection
        void clear();

        //Check if collection contains this item and return the index of where said item is
        int contains(E e);

    }

