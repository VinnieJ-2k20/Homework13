package com.gmail.ptimofejev;

/*Описать класс «Vector3d» (т. е., он должен описывать вектор в трехмерной,
декартовой системе координат). В качестве свойств этого класса возьмите
координаты вектора. Для этого класса реализовать методы сложения, скалярного и
векторного произведения векторов. Создайте несколько объектов этого класса и
протестируйте их.*/

public class Main {

	public static void main(String[] args) {
		Vector3d vector1 = new Vector3d(3.0, 4.2, 3.7);
		Vector3d vector2 = new Vector3d(0, 2.3, -4.6);
		Vector3d vector3 = new Vector3d(11, -2, 0);

		System.out.println(vector1.toString());
		System.out.println(vector2.toString());
		System.out.println(vector3.toString());

		System.out.println("vector1 + vector2 = " + vector1.sum(vector2).toString());
		System.out.println("vector2 + vector3 = " + vector2.sum(vector3).toString());
		
		System.out.println("vector2 * vector3 = " + vector2.multiplyScalar(vector3));
		System.out.println("vector3 * vector1 = " + vector3.multiplyScalar(vector1));
		
		System.out.println("[vector1 * vector3] = " + vector1.multiplyVector(vector3).toString());
		System.out.println("[vector3 * vector1] = " + vector3.multiplyVector(vector1).toString());
	}

}
