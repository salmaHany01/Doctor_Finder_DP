/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPackage;

/**
 *
 * @author Salma
 */
public class Speciality_Factory {

	public static Speciality getSpeciality(String sp_1, String sp_2, String sp_3){
		if(sp_1.equalsIgnoreCase("headache")){
			if(sp_2.equalsIgnoreCase("nausea")){
				if(sp_3.equalsIgnoreCase("mobile teeth")){
					return new Endocrinology();
				}
			}
			else if(sp_2.equalsIgnoreCase("toothache")){
				if(sp_3.equalsIgnoreCase("pain and swelling")){
					return new ear_nose_throat();
				}
			}
			else if(sp_2.equalsIgnoreCase("spitting blood")){
				if(sp_3.equalsIgnoreCase("neck tenderness")){
					return new Dentistry();
				}
			}
			else if(sp_2.equalsIgnoreCase("excessive tearing")){
				if(sp_3.equalsIgnoreCase("night blindness")){
					return new Opthalmology();
				}
			}
		}
		else if(sp_1.equalsIgnoreCase("stomach ache")){
			if(sp_2.equalsIgnoreCase("weakness")){
				if(sp_3.equalsIgnoreCase("constipation")){
					return new internal_medicine();
				}
			}
		}
		else if(sp_1.equalsIgnoreCase("itching")){
			if(sp_2.equalsIgnoreCase("dry skin")){
				if(sp_3.equalsIgnoreCase("friable nails")){
					return new Dermatology();
				}
			}
			else if(sp_2.equalsIgnoreCase("heavy legs")){
				if(sp_3.equalsIgnoreCase("vein soarness")){
					return new Hematology();
				}
			}
		}
		else if(sp_1.equalsIgnoreCase("fatigue")){
			if(sp_2.equalsIgnoreCase("stiff joints")){
				if(sp_3.equalsIgnoreCase("sleeping disorders")){
					return new Orthopedic();
				}
			}
		}
		return null;
	}
}
