package org.bl.docker.test.orgbldockertest;


public class OrgBlDockerTestApplication {

	public static void main(String[] args) {
		int j=2;
		while(j<13) {
			for(int i=1;i<13;i++){
				System.out.println(j+"x"+i+"="+j*i+" ");
			}
			System.out.println();
			j++;
		}
	}
}
