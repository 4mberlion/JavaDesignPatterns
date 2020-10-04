package com.amberlion.behavioral.observer.SimpledressStore.subjects;


import com.amberlion.behavioral.observer.SimpledressStore.observers.Observer;

public interface Subject {
    void addObserver (Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
