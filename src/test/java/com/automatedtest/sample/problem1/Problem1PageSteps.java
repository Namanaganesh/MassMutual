package com.automatedtest.sample.problem1;

import io.cucumber.java.en.Given;
import junit.framework.Assert;

public class Problem1PageSteps {


    private Problem1Page problem1Page;

    public Problem1PageSteps() {
        this.problem1Page = new Problem1Page();
    }

    @Given("^ Given the values are  \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" ,  \"([^\"]*)\" $ ")
    public void GivenValueaAreWithValues(String value1,String value2,String value3,String value4,String value5) {
    	problem1Page.setValue1(value1);
    	problem1Page.setValue2(value2);
    	problem1Page.setValue3(value3);
    	problem1Page.setValue4(value4);
    	problem1Page.setValue5(value5);
    	
    	//toveridy greater than zero for all values
    	Assert.assertTrue(this.problem1Page.verifyValue1GreaterThan0());
    	Assert.assertTrue(this.problem1Page.verifyValue2GreaterThan0());
    	Assert.assertTrue(this.problem1Page.verifyValue3GreaterThan0());
    	Assert.assertTrue(this.problem1Page.verifyValue4GreaterThan0());
    	Assert.assertTrue(this.problem1Page.verifyValue5GreaterThan0());
    	
    	
//        this.problem1Page.goToproblem1Page(country);
    }
    
    @Given("^ Given the values are  \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" ,  \"([^\"]*)\" and \"([^\"]*)\"$ ")
    public void GivenValueaAreWithValuesAndTotal(String value1,String value2,String value3,String value4,String value5,String totla) {
    	this.problem1Page.setValue1(value1);
    	this.problem1Page.setValue2(value2);
    	this.problem1Page.setValue3(value3);
    	this.problem1Page.setValue4(value4);
    	this.problem1Page.setValue5(value5);
    	
    	int total=this.problem1Page.sumValue();
    	
    	String totalBase="$"+total;
    	
    	Assert.assertEquals(totalBase, this.problem1Page.getTotalBase());
    	
    	
    	//verify currency for values
    	
    	Assert.assertTrue(this.problem1Page.verifyValue1Currency());
    	Assert.assertTrue(this.problem1Page.verifyValue2Currency());
    	Assert.assertTrue(this.problem1Page.verifyValue3Currency());
    	Assert.assertTrue(this.problem1Page.verifyValue4Currency());
    	Assert.assertTrue(this.problem1Page.verifyValue5Currency());
    }
}
