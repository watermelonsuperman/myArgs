package com.thoughtworks.basic;

import java.util.List;

public class Args {
    private List<Arg> argPairs;
    private String args;
    private Schema schema;

    public Args(String args,Schema schema){ 
        this.args = args;
        this.schema = schema;
    }
    public Object getValueOf(String flag){
        for(Arg arg : argPairs){
            if(arg.getFlag().equals(flag)){
                return arg.parseValue();
            }
        }
        return null;
    }
}
