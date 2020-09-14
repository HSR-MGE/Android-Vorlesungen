package ch.ost.rj.mge.v07.myapplication.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import ch.ost.rj.mge.v07.myapplication.BR;

public class UserObservableClass extends BaseObservable {
    private String firstName;
    private String lastName;
    private int age;

    public UserObservableClass(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    @Bindable
    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}