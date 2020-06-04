package servicio;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Pruebas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JsonPrueba {

	@GET
	
	public  Response pruebaRespuestaJson() {
		return Response.ok("{\n" + 
				"  \"empleados\": [\n" + 
				"       { \"nombre\":\"Jorge\" , \"apellido\":\"Mesa\", \"edad\":28 },\n" + 
				"       { \"nombre\":\"Ana\" , \"apellido\":\"Sánchez\", \"edad\":21 },\n" + 
				"       { \"nombre\":\"Pedro\" , \"apellido\":\"Lee\",\"edad\":44 }\n" + 
				"    ]\n" + 
				"}", MediaType.APPLICATION_JSON).build();
	}
	
}
