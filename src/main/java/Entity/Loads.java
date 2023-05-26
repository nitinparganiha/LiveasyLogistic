package Entity;

import java.sql.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loads {
private String loadingPoin;
private String unloadingPoin;
private String productType;
private String truckType;
private int noOfTrucks;
private int weight;
private String comment;
@Id
private String shipperId;
private Date date;
public String getLoadingPoin() {
	return loadingPoin;
}
public void setLoadingPoin(String loadingPoin) {
	this.loadingPoin = loadingPoin;
}
public String getUnloadingPoin() {
	return unloadingPoin;
}
public void setUnloadingPoin(String unloadingPoin) {
	this.unloadingPoin = unloadingPoin;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
public String getTruckType() {
	return truckType;
}
public void setTruckType(String truckType) {
	this.truckType = truckType;
}
public int getNoOfTrucks() {
	return noOfTrucks;
}
public void setNoOfTrucks(int noOfTrucks) {
	this.noOfTrucks = noOfTrucks;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public String getShipperId() {
	return shipperId;
}
public void setShipperId(String shipperId) {
	this.shipperId = shipperId;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}


}
