package com.thoughtworks.basic;

import java.util.List;

public class Schema {
    private List<FlagSchema> flagSchemas;

    public Schema(List<FlagSchema> flagSchemas) {
        this.flagSchemas = flagSchemas;
    }
    public String getTypeOf(String flag){
        String value = "";
        for(FlagSchema flagSchema : flagSchemas){
            if(flagSchema.getFlag().equals(flag)){
                value = flagSchema.getValueType().getType();
            }else{
                value = "没有对应的数据类型";
            }
        }
        return value;
    }
    public Object getDefaultValueOf(String flag){
        Object value = null;
        for(FlagSchema flagSchema : flagSchemas){
            if(flagSchema.getFlag().equals(flag)){
                value = flagSchema.getValueType().getDefaultValue();
            }else{
                value = "没有对应的默认值";
            }
        }
        return value;
    }

}
