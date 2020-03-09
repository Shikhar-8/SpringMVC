package hellocontroller;

import java.util.ArrayList;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController 
{

		
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() 
		{

		ModelAndView model1 = new ModelAndView("AdmissionForm");
		
		return model1;
		}
		
		
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student) 
	{
		
		//@modelattribute use karna hi better hai varna code galat hi lenghty ho jayega.THE OTHER METHOD I HAVE USED IN " 3- Demo With getting  basic values" folder
        // as sepertely map nahi karna padega each object ko value mei. plus also you have to care about string type or int type.
		
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		return model1;
	}
	
	//***************************Getting all students record******************************
    
	@ResponseBody
	@RequestMapping(value="/students", method = RequestMethod.GET)
	
		public ArrayList<Student> getStudentsList()
		{
				
				Student student1 = new Student();
				student1.setStudentId(1);
				student1.setStudentName("Shikhar");
				
				Student student2 = new Student();
				student2.setStudentId(2);
				student2.setStudentName("Sajal");
				
				Student student3 = new Student();
				student3.setStudentId(3);
				student3.setStudentName("Sandeep");
				
				ArrayList<Student> studentsList = new ArrayList<Student>();
				
				studentsList.add(student1);
				studentsList.add(student2);
				studentsList.add(student3);
				
				return studentsList; // so response body will return all the values in studentsList object.
		}
    
    //***************************Getting a single student record******************************
    
    @ResponseBody
	@RequestMapping(value="/students/{name}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("name") String studentName)
    	{  
    	   Student student= new Student();
    	   student.setStudentName(studentName);
    	   student.setStudentHobby("painting");
    	   
    	   return student;
    	
    	}
    
  //***************************Updating a single student record******************************
    @ResponseBody
    @RequestMapping(value="/students/{name}", method = RequestMethod.PUT)
	public boolean updateStudent(@PathVariable("name") String studentName, @RequestBody Student student)// here request body ka kaam hai jis bhi data format  mei manga hai data usko java object mei bana kar return kardo, if asked in json then it will convert json data in JAVA object.
	{ 
    	System.out.println(" Student Name : "+studentName);
    	System.out.println(" Student Name : "+student.getStudentName()+"Student Hobby : "+student.getStudentHobby());
    	
    	// fetch update db query
    	
    	// if successfull
    	return true;
    	
	}
    
    //***************************Inserting a single student record******************************
    @ResponseBody
    @RequestMapping(value="/students/{name}", method = RequestMethod.POST)
    public boolean insertStudent(@PathVariable("name") String studentName, @RequestBody Student student)
	{ 
    	// so when u enter the api on postman after updating what is required and clicking on send button it will come here. 
    	System.out.println(" Student Name : "+student.getStudentName()+"Student Hobby : "+student.getStudentHobby());
    	
    	// insert query for inserting a student record into database.
    	
     	// if successfull
    	return true;
    	
	}
    
  //***************************Deleting a single student record******************************
    @ResponseBody
    @RequestMapping(value="/students/{name}", method = RequestMethod.DELETE)
    public boolean deleteStudent(@PathVariable("name") String studentName)
    {
    	System.out.println("Student name :"+studentName );
    	// delete the student record from databse.
    	
    	return true;
    }
	
}