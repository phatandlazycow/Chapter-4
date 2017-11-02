public class Name{
    private String first;
    private String middle;
    private String last;
    public Name(String frst,String mddl, String lst){
        this.first=frst;
        this.middle=mddl;
        this.last=lst;
    }
    public String getFirst(){
        return this.first;
    }
    public String getSecond(){
        return this.middle;
    }
    public String getLast(){
        return this.last;
    }
    public String firstMiddleLast(){
        return this.first+" "+this.middle+" "+this.last;
    }
    public String lastFirstMiddle(){
        return this.last+" "+this.first+" "+this.middle;
    }
    public boolean equals(Name otherName){
        if(first.equalsIgnoreCase(otherName.first) && middle.equalsIgnoreCase(otherName.middle)&&last.equalsIgnoreCase(otherName.last)){
            return true;
        }
        else {
            return false;
        }
    }
    public String initials(){
        return first.substring(0)+" "+middle.substring(0)+" "+last.substring(0);
    }
    public int length(){
        return first.length()+middle.length()+last.length();
    }
}