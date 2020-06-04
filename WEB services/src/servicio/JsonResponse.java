package servicio;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Encuesta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JsonResponse {
	
	@GET
	public Response sayHello() {
		return Response.ok("{\n" + 
				"  \"empleados\": [\n" + 
				"       { \"Titulo Encuesta\":\"Niños 6-8\" , \"Categoria\":\"Familia\", \"Edad Dirigida\":0 },\n" + 
				"       { \"Titulo Encuesta\":\"Niños 9-11\" , \"Categoria\":\"Relaciones\", \"Edad Dirigida\":0 },\n" + 
				"       { \"Titulo Encuesta\":\"Niños 12-14\" , \"Categoria\":\"Familia\",\"Edad Dirigida\":0 }\n" + 
				"    ]\n" + 
				"}", MediaType.APPLICATION_JSON).build();
	}
	
	
}