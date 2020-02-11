package com.gmail.ptimofejev;

public class Vector3d {
	private double x;
	private double y;
	private double z;

	public Vector3d() {

	}

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public Vector3d sum(Vector3d b) {
		Vector3d vectorAdd = new Vector3d();
		vectorAdd.setX(this.x + b.getX());
		vectorAdd.setY(this.y + b.getY());
		vectorAdd.setZ(this.z + b.getZ());
		return vectorAdd;
	}
	
	public double multiplyScalar(Vector3d b) {
		double result = this.x * b.getX() + this.y * b.getY() + this.z * b.getZ();
		return result;
	}

	public Vector3d multiplyVector(Vector3d b) {
		Vector3d vectorMulti = new Vector3d();
		vectorMulti.setX(this.y * b.getZ() - b.getY() * this.z);
		vectorMulti.setY(this.x * b.getZ() - b.getX() * this.z);
		vectorMulti.setZ(this.x * b.getY() - b.getX() * this.y);
		return vectorMulti;
	}

	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
