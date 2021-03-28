package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ReadOnlyFirst;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class ArrayTest   {
  
  private @Valid List<String> arrayOfString = new ArrayList<String>();
  private @Valid List<List<Long>> arrayArrayOfInteger = new ArrayList<List<Long>>();
  private @Valid List<List<ReadOnlyFirst>> arrayArrayOfModel = new ArrayList<List<ReadOnlyFirst>>();

  /**
   **/
  public ArrayTest arrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  public List<String> getArrayOfString() {
    return arrayOfString;
  }

  public void setArrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }

  public ArrayTest addArrayOfStringItem(String arrayOfStringItem) {
    if (this.arrayOfString == null) {
      this.arrayOfString = new ArrayList<String>();
    }

    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

  public ArrayTest removeArrayOfStringItem(String arrayOfStringItem) {
    if (arrayOfStringItem != null && this.arrayOfString != null) {
      this.arrayOfString.remove(arrayOfStringItem);
    }

    return this;
  }
/**
   **/
  public ArrayTest arrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }

  public void setArrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }

  public ArrayTest addArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    if (this.arrayArrayOfInteger == null) {
      this.arrayArrayOfInteger = new ArrayList<List<Long>>();
    }

    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

  public ArrayTest removeArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    if (arrayArrayOfIntegerItem != null && this.arrayArrayOfInteger != null) {
      this.arrayArrayOfInteger.remove(arrayArrayOfIntegerItem);
    }

    return this;
  }
/**
   **/
  public ArrayTest arrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  public List<List<ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }

  public void setArrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }

  public ArrayTest addArrayArrayOfModelItem(List<ReadOnlyFirst> arrayArrayOfModelItem) {
    if (this.arrayArrayOfModel == null) {
      this.arrayArrayOfModel = new ArrayList<List<ReadOnlyFirst>>();
    }

    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }

  public ArrayTest removeArrayArrayOfModelItem(List<ReadOnlyFirst> arrayArrayOfModelItem) {
    if (arrayArrayOfModelItem != null && this.arrayArrayOfModel != null) {
      this.arrayArrayOfModel.remove(arrayArrayOfModelItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
    return Objects.equals(this.arrayOfString, arrayTest.arrayOfString) &&
        Objects.equals(this.arrayArrayOfInteger, arrayTest.arrayArrayOfInteger) &&
        Objects.equals(this.arrayArrayOfModel, arrayTest.arrayArrayOfModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfString, arrayArrayOfInteger, arrayArrayOfModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

