package com.example;

/**
 * Created by LunaFlores on 12/19/16.
 */
public class Wrapper <E> {
    private E e;

    public Wrapper(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public String getType(){
        return e.getClass().getName();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wrapper<?> wrapper = (Wrapper<?>) o;

        //return e != null ? e.equals(wrapper.e) : wrapper.e == null;
        if (e != null){
            return e.equals(wrapper.e);
        } else {
            return wrapper.e == null;
        }
    }

    @Override
    public int hashCode() {
        //return e != null ? e.hashCode() : 0;
        if (e != null){
            return e.hashCode();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "e=" + e +
                '}';
    }
}
