package VORTEX.DARIPROJECT.ENTITY;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name = "ADS")
public class Ads implements Serializable{
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	private int AdID;
	private String Adname;
	private String AdLocation ;
	private String AdDescription;
	private int price;
	private Date AdDate;
	private Float Area;
	private int RoomNo;
	private property_type Type;
	private Boolean parkingSpace;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "ads")
	private Set<customer> customers;
	
	@OneToOne
	private real_estate real_estate;

	public int getAdID() {
		return AdID;
	}

	public void setAdID(int adID) {
		AdID = adID;
	}

	public String getAdname() {
		return Adname;
	}

	public void setAdname(String adname) {
		Adname = adname;
	}

	public String getAdLocation() {
		return AdLocation;
	}

	public void setAdLocation(String adLocation) {
		AdLocation = adLocation;
	}

	public String getAdDescription() {
		return AdDescription;
	}

	public void setAdDescription(String adDescription) {
		AdDescription = adDescription;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getAdDate() {
		return AdDate;
	}

	public void setAdDate(Date adDate) {
		AdDate = adDate;
	}

	public Float getArea() {
		return Area;
	}

	public void setArea(Float area) {
		Area = area;
	}

	public int getRoomNo() {
		return RoomNo;
	}

	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}

	public property_type getType() {
		return Type;
	}

	public void setType(property_type type) {
		Type = type;
	}

	public Boolean getParkingSpace() {
		return parkingSpace;
	}

	public void setParkingSpace(Boolean parkingSpace) {
		this.parkingSpace = parkingSpace;
	}
	
	
	
}
