package com.thoughtworks.basic;

public class Arg {
    private String flag;
    private String value;
    private String type;
    public Arg(String flag,String value,Schema schema){
        if(value == null){
            this.value = schema.getDefaultValueOf(value).toString();
        }
        this.type = schema.getTypeOf(flag);

    }
    public Object parseValue(){
       if(value.equals(ValueType.BOOLEAN.getType())){
           return Boolean.parseBoolean(this.value);
       }else if(value.equals(ValueType.INTEGER.getType())){
           return Integer.parseInt(this.value);
       }else if(value.equals(ValueType.STRING.getType())){
           return value;
       }else{
           return "无法解析";
       }
    }
    public boolean withFlag(){
        if(type != null){
            return true;
        }else {
            return false;
        }
    }

    public String getFlag() {
        return flag;
    }
}
