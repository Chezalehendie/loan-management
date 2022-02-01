import java.util.*;
class Account{
    Account(){

    }

    private String name;
    private String pgOfStudy;
    private int yrOfStudy;

public void setName(String name){
    this.name = name;
}
public String getName(){
    return name;
}
public void setPgOfStudy(String pgOfStudy){
    this.pgOfStudy=pgOfStudy;
}
public String getPgOfStudy(){
    return pgOfStudy;
}
public void setYrOfStudy(int yrOfStudy){
    this.yrOfStudy=yrOfStudy;
}
public int getYrOfStudy(){
    return yrOfStudy;
}
}