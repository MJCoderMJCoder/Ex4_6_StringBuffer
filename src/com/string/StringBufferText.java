package com.string;

public class StringBufferText {

	public static void main(String[] args) {
		System.out.println("------����������������------");
		char c1, ch1[] = new char[13];
		String str1 = "";
		StringBuffer sbufstr1;
		boolean bFlag = true;
		sbufstr1 = new StringBuffer("NewStrBuffer");
		
		//1.�ַ�������������ת��Ϊ�ַ���
		str1 = sbufstr1.toString();	//toString()�������ת�����񣬽�StringBuffer����ת����String����
		str1 = str1 + ":";
		System.out.println(str1);
		ch1 = str1.toCharArray();	//��String����ת��Ϊ�ַ����飻
		System.out.println(ch1);
		
		//2.׷���ַ�;append�����ӡ����
		sbufstr1 = sbufstr1.append(bFlag);
		sbufstr1 = sbufstr1.append(3456);
		sbufstr1 = sbufstr1.append(12345678987654L);
		sbufstr1 = sbufstr1.append(3.14159F);
		sbufstr1 = sbufstr1.append(2.71717171);
		sbufstr1 = sbufstr1.append("�й�");
		sbufstr1 = sbufstr1.append(new StringBuffer("��ž�"));
		System.out.println(sbufstr1);
		
		//3.�����ַ�
		sbufstr1 = new StringBuffer("NewStrBuffer");
		sbufstr1 = sbufstr1.insert(6, "ing");	//�á�NewStringBuffer��
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(sbufstr1.length(), ":");	//�á�NewStringBuffer����
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, bFlag);	//�á�trueNewStringBuffer����
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, ch1, 6, 3);//�á�BuftrueNewStringBuffer��������ch1��6����ʼѡ3��Ԫ��
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, 3456);//�á�3456BuftrueNewStringBuffer����
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, 12345678987654L);
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, 3.14159F);
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, 2.71);
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, new StringBuffer("��ž�"));
		sbufstr1 = sbufstr1.insert(0, "�й�����");
		System.out.println(sbufstr1);
		
		//4.�滻�ַ�
		str1 = "You have a ";
		sbufstr1 = sbufstr1.replace(0, 6, str1);	//��0��ʼ����6������λ���滻��str1;
		System.out.println(sbufstr1);
		
		//5.ɾ���ַ�
		sbufstr1.delete(3, 6);
		System.out.println(sbufstr1);
		sbufstr1.deleteCharAt(2);	//ɾ����ǰStringBuffer������������Ϊ2���ַ�
		System.out.println(sbufstr1);	
		
		//6.����ַ���
		//sbufstr1.ensureCapacity(1);	//ensure��ȷ�����ǰ�ȫ��capacity������������
		System.out.println(sbufstr1);
		sbufstr1.setLength(0);	//���������ַ������������ַ����ĳ���
		sbufstr1.append("�й������ž�");
		System.out.println(sbufstr1);
		
		//7.ȡ�ַ�
		c1 = sbufstr1.charAt(3);	//�ڵ�ǰStringBuffer������ȡ������Ϊ3���ַ�
		System.out.println(c1);
		
		//8.ȡ�Ӵ�
		str1 = sbufstr1.substring(3);	//ȡ��ǰStringBuffer�����д�3��ʼ����β���Ӵ�
		System.out.println(str1);
		str1 = sbufstr1.substring(3, 6);
		System.out.println(str1);
		
		//9.�ַ�����ת
		sbufstr1.reverse();	//reverse����ת
		System.out.println(sbufstr1);
		str1 = sbufstr1.toString();	//����ǰStringBuffer����ת����String����
		System.out.println(str1);
		System.out.println("----------�������������----------------");
	}
}
