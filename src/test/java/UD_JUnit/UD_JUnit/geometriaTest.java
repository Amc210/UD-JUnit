package UD_JUnit.UD_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import UD_JUnitGeo.Ud_JUnit.Geometria;

class geometriaTest {

	Geometria geo;

	@BeforeEach
	public void before() {
		System.out.println("before()");
		geo = new Geometria();
	}

	@Test
	public void constructor() {
		geo = new Geometria(2);
	}

	@AfterEach
	public void after() {
		System.out.println("after()");
	}

	@Test
	void testMain() {
		Geometria geo = new Geometria();
		assertEquals(geo, geo);
	}

	@Test
	public void testCuadrado() {
		int result = geo.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, result);
	}

	@Test
	public void testCirculo() {
		double result = geo.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, result);
	}

	@Test
	public void areaTriangulo() {
		int result = geo.areatriangulo(2, 4);
		int esperado = 4;
		assertEquals(esperado, result);
	}

	@Test
	public void areaRectangulo() {
		int result = geo.arearectangulo(2, 4);
		int esperado = 8;
		assertEquals(esperado, result);
	}

	@Test
	public void areaPentagono() {
		int result = geo.areapentagono(4, 8);
		int esperado = 16;
		assertEquals(esperado, result);
	}

	@Test
	public void areaRombo() {
		int result = geo.arearombo(5, 10);
		int esperado = 25;
		assertEquals(esperado, result);
	}

	@Test
	public void areaRomboide() {
		int result = geo.arearomboide(5, 10);
		int esperado = 50;
		assertEquals(esperado, result);
	}

	@Test
	public void areaTrapecio() {
		int result = geo.areatrapecio(5, 5, 2);
		int esperado = 10;
		assertEquals(esperado, result);
	}

	// Switch
	@Test
	public void areaCuadradoS() {
		String result = geo.figura(1);
		String esperado = "Cuadrado";
		assertEquals(esperado, result);
	}

	@Test
	public void areaCirculoS() {
		String result = geo.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado, result);
	}

	@Test
	public void areaTrianculoS() {
		String result = geo.figura(3);
		String esperado = "Triangulo";
		assertEquals(esperado, result);
	}

	@Test
	public void areaRectanguloS() {
		String result = geo.figura(4);
		String esperado = "Rectangulo";
		assertEquals(esperado, result);
	}

	@Test
	public void areaPentagonoS() {
		String result = geo.figura(5);
		String esperado = "Pentagono";
		assertEquals(esperado, result);
	}

	@Test
	public void areaRomboS() {
		String result = geo.figura(6);
		String esperado = "Rombo";
		assertEquals(esperado, result);
	}

	@Test
	public void areaRomboideS() {
		String result = geo.figura(7);
		String esperado = "Romboide";
		assertEquals(esperado, result);
	}

	@Test
	public void areaTrapecioS() {
		String result = geo.figura(8);
		String esperado = "Trapecio";
		assertEquals(esperado, result);
	}

	@Test
	public void areaDefaultS() {
		String result = geo.figura(9);
		String esperado = "Default";
		assertEquals(esperado, result);
	}

	@Test
	public void getId() {
		int result = geo.getId();
		int esperado = geo.getId();
		assertEquals(esperado, result);
	}

	@Test
	public void setId() {
		geo.setId(1);
		int result = geo.getId();
		int esperado = 1;
		assertEquals(esperado, result);
	}

	@Test
	public void getNom() {
		String result = geo.getNom();
		String esperado = geo.getNom();
		assertEquals(esperado, result);
	}

	@Test
	public void setNom() {
		geo.setNom("Cuadrado");
		String result = geo.getNom();
		String esperado = geo.getNom();
		assertEquals(esperado, result);
	}

	@Test
	public void getArea() {
		double result = geo.getArea();
		double esperado = geo.getArea();
		assertEquals(esperado, result);
	}

	@Test
	public void setArea() {
		geo.setArea(10);
		double result = geo.getArea();
		double esperado = geo.getArea();
		assertEquals(esperado, result);
	}

	@Test
	public void testToString() {
		geo.setId(1);
		geo.setNom("Cuadrado");
		geo.setArea(10);
		String result = geo.toString();
		String esperado = "Geometria [id=" + geo.getId() + ", nom=" + geo.getNom() + ", area=" + geo.getArea() + "]";
		assertEquals(esperado, result);
	}
}
