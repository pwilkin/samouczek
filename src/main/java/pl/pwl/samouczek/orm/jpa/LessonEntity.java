/*
 * Created on 1 gru 2014 ( Time 21:45:44 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package pl.pwl.samouczek.orm.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "lesson"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="lesson")
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="LessonEntity.countAll", query="SELECT COUNT(x) FROM LessonEntity x" )
} )
public class LessonEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="title", length=255)
    private String     title        ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="lesson", targetEntity=MaterialEntity.class, fetch=FetchType.LAZY)
    private List<MaterialEntity> listOfMaterial;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public LessonEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : title ( VARCHAR ) 
    public void setTitle( String title ) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfMaterial( List<MaterialEntity> listOfMaterial ) {
        this.listOfMaterial = listOfMaterial;
    }
    public List<MaterialEntity> getListOfMaterial() {
        return this.listOfMaterial;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(title);
        return sb.toString(); 
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (obj instanceof LessonEntity) {
    		if (((LessonEntity) obj).getId() != null && getId() != null) {
    			return getId().equals(((LessonEntity) obj).getId());
    		}
    	}
    	return super.equals(obj);
    }
    
    @Override
    public int hashCode() {
    	if (getId() != null) {
    		return getId().hashCode() * 2;
    	} else {
    		return (hashCode() * 2) + 1;
    	}
    }

}
