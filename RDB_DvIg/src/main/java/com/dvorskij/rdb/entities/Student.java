package com.dvorskij.rdb.entities;

import java.io.Serializable;
import javax.validation.constraints.Min;
import static com.dvorskij.rdb.staticinfo.StaticInfo.*;

public class Student implements Serializable {

	@Min(value = STUDENT_ID_CONSTRAINT)
	private int id;
	
	
	private static final long serialVersionUID = -9014003927793193598L;
}
