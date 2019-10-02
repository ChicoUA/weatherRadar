package ies.aula1.ex1.weatherRadar;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cities {
	@SerializedName("owner")
	@Expose
	private String owner;
	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("data")
	@Expose
	private List<Datum> data = null;

	public String getOwner() {
	return owner;
	}

	public void setOwner(String owner) {
	this.owner = owner;
	}

	public String getCountry() {
	return country;
	}

	public void setCountry(String country) {
	this.country = country;
	}

	public List<Datum> getData() {
	return data;
	}

	public void setData(List<Datum> data) {
	this.data = data;
	}

	@Override
	public String toString() {
		return "Cities [owner=" + owner + ", country=" + country + ", data=" + data + "]";
	}
	
}

class Datum {

@SerializedName("idRegiao")
@Expose
private Integer idRegiao;
@SerializedName("idAreaAviso")
@Expose
private String idAreaAviso;
@SerializedName("idConcelho")
@Expose
private Integer idConcelho;
@SerializedName("globalIdLocal")
@Expose
private Integer globalIdLocal;
@SerializedName("latitude")
@Expose
private String latitude;
@SerializedName("idDistrito")
@Expose
private Integer idDistrito;
@SerializedName("local")
@Expose
private String local;
@SerializedName("longitude")
@Expose
private String longitude;

public Integer getIdRegiao() {
return idRegiao;
}

public void setIdRegiao(Integer idRegiao) {
this.idRegiao = idRegiao;
}

public String getIdAreaAviso() {
return idAreaAviso;
}

public void setIdAreaAviso(String idAreaAviso) {
this.idAreaAviso = idAreaAviso;
}

public Integer getIdConcelho() {
return idConcelho;
}

public void setIdConcelho(Integer idConcelho) {
this.idConcelho = idConcelho;
}

public Integer getGlobalIdLocal() {
return globalIdLocal;
}

public void setGlobalIdLocal(Integer globalIdLocal) {
this.globalIdLocal = globalIdLocal;
}

public String getLatitude() {
return latitude;
}

public void setLatitude(String latitude) {
this.latitude = latitude;
}

public Integer getIdDistrito() {
return idDistrito;
}

public void setIdDistrito(Integer idDistrito) {
this.idDistrito = idDistrito;
}

public String getLocal() {
return local;
}

public void setLocal(String local) {
this.local = local;
}

public String getLongitude() {
return longitude;
}

public void setLongitude(String longitude) {
this.longitude = longitude;
}

public String toString() {
	return "DATUM [local=" + local + ", globalid=" + globalIdLocal + "]";
}

}
