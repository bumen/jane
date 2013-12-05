// This file is generated by genbeans tool. Do NOT edit it! @formatter:off
package sas.bean;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import sas.core.Bean;
import sas.core.MarshalException;
import sas.core.Octets;
import sas.core.OctetsStream;
import sas.core.Util;

/**
 * 测试生成所有支持的类型
 */
public final class TestType extends Bean<TestType> implements Comparable<TestType>
{
	private static final long serialVersionUID = 0xbeacabe90777739dL;
	public  static final int BEAN_TYPE = 2;

	public  /* 1*/ boolean v1; // 1字节布尔,0表示假,1表示真,其它默认表示真
	public  /* 2*/ byte v2; // 1字节整数
	public  /* 3*/ short v3; // 2字节整数
	public  /* 4*/ int v4; // 4字节整数
	public  /* 5*/ long v5; // 8字节整数
	public  /* 6*/ float v6; // 4字节浮点数
	public  /* 7*/ double v7; // 8字节浮点数
	public  /* 8*/ final Octets v8; // 二进制数据(Octets)
	private /* 9*/ String v9; // 字符串(String)
	public  /*10*/ final ArrayList<Boolean> v10; // 数组容器(ArrayList)
	public  /*11*/ final LinkedList<Byte> v11; // 链表容器(LinkedList)
	public  /*12*/ final ArrayDeque<Integer> v12; // 队列容器(ArrayDeque)
	public  /*13*/ final HashSet<Long> v13; // 无序集合容器(HashSet)
	public  /*14*/ final TreeSet<Float> v14; // 排序集合容器(TreeSet)
	public  /*15*/ final LinkedHashSet<Double> v15; // 有序集合容器(LinkedHashSet)
	public  /*16*/ final HashMap<Long, String> v16; // 无序映射容器(HashMap)
	public  /*17*/ final TreeMap<TestBean, Boolean> v17; // 排序映射容器(TreeMap)
	public  /*18*/ final LinkedHashMap<Octets, TestBean> v18; // 有序映射容器(LinkedHashMap)
	public  /*19*/ final TestBean v19; // 嵌入其它bean

	public TestType()
	{
		v8 = new Octets(5);
		v9 = "";
		v10 = new ArrayList<>(10);
		v11 = new LinkedList<>();
		v12 = new ArrayDeque<>();
		v13 = new HashSet<>();
		v14 = new TreeSet<>();
		v15 = new LinkedHashSet<>();
		v16 = new HashMap<>(0);
		v17 = new TreeMap<>();
		v18 = new LinkedHashMap<>();
		v19 = new TestBean();
	}

	public TestType(boolean v1, byte v2, short v3, int v4, long v5, float v6, double v7, Octets v8, String v9, Collection<Boolean> v10, Collection<Byte> v11, Collection<Integer> v12, Collection<Long> v13, Collection<Float> v14, Collection<Double> v15, Map<Long, String> v16, Map<TestBean, Boolean> v17, Map<Octets, TestBean> v18, TestBean v19)
	{
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
		this.v5 = v5;
		this.v6 = v6;
		this.v7 = v7;
		this.v8 = new Octets(5); if(v8 != null) this.v8.replace(v8);
		this.v9 = (v9 != null ? v9 : "");
		this.v10 = new ArrayList<>(10); if(v10 != null) this.v10.addAll(v10);
		this.v11 = new LinkedList<>(); if(v11 != null) this.v11.addAll(v11);
		this.v12 = new ArrayDeque<>(); if(v12 != null) this.v12.addAll(v12);
		this.v13 = new HashSet<>(); if(v13 != null) this.v13.addAll(v13);
		this.v14 = new TreeSet<>(); if(v14 != null) this.v14.addAll(v14);
		this.v15 = new LinkedHashSet<>(); if(v15 != null) this.v15.addAll(v15);
		this.v16 = new HashMap<>(0); if(v16 != null) this.v16.putAll(v16);
		this.v17 = new TreeMap<>(); if(v17 != null) this.v17.putAll(v17);
		this.v18 = new LinkedHashMap<>(); if(v18 != null) this.v18.putAll(v18);
		this.v19 = (v19 != null ? v19.clone() : new TestBean());
	}

	@Override
	public void reset()
	{
		v1 = false;
		v2 = 0;
		v3 = 0;
		v4 = 0;
		v5 = 0;
		v6 = 0;
		v7 = 0;
		v8.clear();
		v9 = "";
		v10.clear();
		v11.clear();
		v12.clear();
		v13.clear();
		v14.clear();
		v15.clear();
		v16.clear();
		v17.clear();
		v18.clear();
		v19.reset();
	}

	public void assign(TestType b)
	{
		if(b == null) { reset(); return; }
		this.v1 = b.v1;
		this.v2 = b.v2;
		this.v3 = b.v3;
		this.v4 = b.v4;
		this.v5 = b.v5;
		this.v6 = b.v6;
		this.v7 = b.v7;
		if(b.v8 != null) this.v8.replace(b.v8); else this.v8.clear();
		this.v9 = (b.v9 != null ? b.v9 : "");
		this.v10.clear(); if(b.v10 != null) this.v10.addAll(b.v10);
		this.v11.clear(); if(b.v11 != null) this.v11.addAll(b.v11);
		this.v12.clear(); if(b.v12 != null) this.v12.addAll(b.v12);
		this.v13.clear(); if(b.v13 != null) this.v13.addAll(b.v13);
		this.v14.clear(); if(b.v14 != null) this.v14.addAll(b.v14);
		this.v15.clear(); if(b.v15 != null) this.v15.addAll(b.v15);
		this.v16.clear(); if(b.v16 != null) this.v16.putAll(b.v16);
		this.v17.clear(); if(b.v17 != null) this.v17.putAll(b.v17);
		this.v18.clear(); if(b.v18 != null) this.v18.putAll(b.v18);
		this.v19.assign(b.v19);
	}

	public boolean getV1()
	{
		return v1;
	}

	public void setV1(boolean v1)
	{
		this.v1 = v1;
	}

	public byte getV2()
	{
		return v2;
	}

	public void setV2(byte v2)
	{
		this.v2 = v2;
	}

	public short getV3()
	{
		return v3;
	}

	public void setV3(short v3)
	{
		this.v3 = v3;
	}

	public int getV4()
	{
		return v4;
	}

	public void setV4(int v4)
	{
		this.v4 = v4;
	}

	public long getV5()
	{
		return v5;
	}

	public void setV5(long v5)
	{
		this.v5 = v5;
	}

	public float getV6()
	{
		return v6;
	}

	public void setV6(float v6)
	{
		this.v6 = v6;
	}

	public double getV7()
	{
		return v7;
	}

	public void setV7(double v7)
	{
		this.v7 = v7;
	}

	public Octets getV8()
	{
		return v8;
	}

	public String getV9()
	{
		return v9;
	}

	public void setV9(String v9)
	{
		this.v9 = (v9 != null ? v9 : "");
	}

	public ArrayList<Boolean> getV10()
	{
		return v10;
	}

	public LinkedList<Byte> getV11()
	{
		return v11;
	}

	public ArrayDeque<Integer> getV12()
	{
		return v12;
	}

	public HashSet<Long> getV13()
	{
		return v13;
	}

	public TreeSet<Float> getV14()
	{
		return v14;
	}

	public LinkedHashSet<Double> getV15()
	{
		return v15;
	}

	public HashMap<Long, String> getV16()
	{
		return v16;
	}

	public TreeMap<TestBean, Boolean> getV17()
	{
		return v17;
	}

	public LinkedHashMap<Octets, TestBean> getV18()
	{
		return v18;
	}

	public TestBean getV19()
	{
		return v19;
	}

	@Override
	public int type()
	{
		return 2;
	}

	@Override
	public int initSize()
	{
		return 256;
	}

	@Override
	public int maxSize()
	{
		return 65536;
	}

	@Override
	public TestType create()
	{
		return new TestType();
	}

	@Override
	public OctetsStream marshal(OctetsStream s)
	{
		if(this.v1) s.marshal1((byte)1).marshal1((byte)1);
		if(this.v2 != 0) s.marshal1((byte)2).marshal(this.v2);
		if(this.v3 != 0) s.marshal1((byte)3).marshal(this.v3);
		if(this.v4 != 0) s.marshal1((byte)4).marshal(this.v4);
		if(this.v5 != 0) s.marshal1((byte)5).marshal(this.v5);
		if(this.v6 != 0) s.marshal2(0xc600).marshal(this.v6);
		if(this.v7 != 0) s.marshal2(0xc701).marshal(this.v7);
		if(!this.v8.empty()) s.marshal1((byte)0x48).marshal(this.v8);
		if(!this.v9.isEmpty()) s.marshal1((byte)0x49).marshal(this.v9);
		if(!this.v10.isEmpty())
		{
			s.marshal2(0xca80).marshalUInt(this.v10.size());
			for(Boolean v : this.v10)
				s.marshal(v);
		}
		if(!this.v11.isEmpty())
		{
			s.marshal2(0xcb80).marshalUInt(this.v11.size());
			for(Byte v : this.v11)
				s.marshal(v);
		}
		if(!this.v12.isEmpty())
		{
			s.marshal2(0xcc80).marshalUInt(this.v12.size());
			for(Integer v : this.v12)
				s.marshal(v);
		}
		if(!this.v13.isEmpty())
		{
			s.marshal2(0xcd80).marshalUInt(this.v13.size());
			for(Long v : this.v13)
				s.marshal(v);
		}
		if(!this.v14.isEmpty())
		{
			s.marshal2(0xce84).marshalUInt(this.v14.size());
			for(Float v : this.v14)
				s.marshal(v);
		}
		if(!this.v15.isEmpty())
		{
			s.marshal2(0xcf85).marshalUInt(this.v15.size());
			for(Double v : this.v15)
				s.marshal(v);
		}
		if(!this.v16.isEmpty())
		{
			s.marshal2(0xd0c1).marshalUInt(this.v16.size());
			for(Entry<Long, String> e : this.v16.entrySet())
				s.marshal(e.getKey()).marshal(e.getValue());
		}
		if(!this.v17.isEmpty())
		{
			s.marshal2(0xd1d0).marshalUInt(this.v17.size());
			for(Entry<TestBean, Boolean> e : this.v17.entrySet())
				s.marshal(e.getKey()).marshal(e.getValue());
		}
		if(!this.v18.isEmpty())
		{
			s.marshal2(0xd2ca).marshalUInt(this.v18.size());
			for(Entry<Octets, TestBean> e : this.v18.entrySet())
				s.marshal(e.getKey()).marshal(e.getValue());
		}
		{
			int n = s.size();
			this.v19.marshal(s.marshal1((byte)0x93));
			if(s.size() - n < 3) s.resize(n);
		}
		return s.marshal1((byte)0);
	}

	@Override
	public OctetsStream unmarshal(OctetsStream s) throws MarshalException
	{
		for(;;) { int i = s.unmarshalByte() & 0xff, t = i >> 6; switch(i & 0x3f)
		{
			case 0: return s;
			case 1: this.v1 = (s.unmarshalInt(t) != 0); break;
			case 2: this.v2 = (byte)s.unmarshalInt(t); break;
			case 3: this.v3 = (short)s.unmarshalInt(t); break;
			case 4: this.v4 = s.unmarshalInt(t); break;
			case 5: this.v5 = s.unmarshalLong(t); break;
			case 6: this.v6 = s.unmarshalFloat(t); break;
			case 7: this.v7 = s.unmarshalDouble(t); break;
			case 8: s.unmarshal(this.v8, t); break;
			case 9: this.v9 = s.unmarshalString(t); break;
			case 10:
			{
				this.v10.clear();
				if(t != 3) { s.unmarshalSkipVar(t); break; }
				t = s.unmarshalByte();
				if((t & 0xc0) != 0x80) { s.unmarshalSkipVarSub(t); break; }
				t &= 7;
				int n = s.unmarshalUInt();
				this.v10.ensureCapacity(n < 0x10000 ? n : 0x10000);
				for(; n > 0; --n)
					this.v10.add((s.unmarshalIntKV(t) != 0));
			} break;
			case 11:
			{
				this.v11.clear();
				if(t != 3) { s.unmarshalSkipVar(t); break; }
				t = s.unmarshalByte();
				if((t & 0xc0) != 0x80) { s.unmarshalSkipVarSub(t); break; }
				t &= 7;
				for(int n = s.unmarshalUInt(); n > 0; --n)
					this.v11.add((byte)s.unmarshalIntKV(t));
			} break;
			case 12:
			{
				this.v12.clear();
				if(t != 3) { s.unmarshalSkipVar(t); break; }
				t = s.unmarshalByte();
				if((t & 0xc0) != 0x80) { s.unmarshalSkipVarSub(t); break; }
				t &= 7;
				for(int n = s.unmarshalUInt(); n > 0; --n)
					this.v12.add(s.unmarshalIntKV(t));
			} break;
			case 13:
			{
				this.v13.clear();
				if(t != 3) { s.unmarshalSkipVar(t); break; }
				t = s.unmarshalByte();
				if((t & 0xc0) != 0x80) { s.unmarshalSkipVarSub(t); break; }
				t &= 7;
				for(int n = s.unmarshalUInt(); n > 0; --n)
					this.v13.add(s.unmarshalLongKV(t));
			} break;
			case 14:
			{
				this.v14.clear();
				if(t != 3) { s.unmarshalSkipVar(t); break; }
				t = s.unmarshalByte();
				if((t & 0xc0) != 0x80) { s.unmarshalSkipVarSub(t); break; }
				t &= 7;
				for(int n = s.unmarshalUInt(); n > 0; --n)
					this.v14.add(s.unmarshalFloatKV(t));
			} break;
			case 15:
			{
				this.v15.clear();
				if(t != 3) { s.unmarshalSkipVar(t); break; }
				t = s.unmarshalByte();
				if((t & 0xc0) != 0x80) { s.unmarshalSkipVarSub(t); break; }
				t &= 7;
				for(int n = s.unmarshalUInt(); n > 0; --n)
					this.v15.add(s.unmarshalDoubleKV(t));
			} break;
			case 16:
			{
				this.v16.clear();
				if(t != 3) { s.unmarshalSkipVar(t); break; }
				t = s.unmarshalByte();
				if((t & 0xc0) != 0xc0) { s.unmarshalSkipVarSub(t); break; }
				int k = (t >> 3) & 7; t &= 7;
				for(int n = s.unmarshalUInt(); n > 0; --n)
					this.v16.put(s.unmarshalLongKV(k), s.unmarshalStringKV(t));
			} break;
			case 17:
			{
				this.v17.clear();
				if(t != 3) { s.unmarshalSkipVar(t); break; }
				t = s.unmarshalByte();
				if((t & 0xc0) != 0xc0) { s.unmarshalSkipVarSub(t); break; }
				int k = (t >> 3) & 7; t &= 7;
				for(int n = s.unmarshalUInt(); n > 0; --n)
					this.v17.put(s.unmarshalBeanKV(new TestBean(), k), (s.unmarshalIntKV(t) != 0));
			} break;
			case 18:
			{
				this.v18.clear();
				if(t != 3) { s.unmarshalSkipVar(t); break; }
				t = s.unmarshalByte();
				if((t & 0xc0) != 0xc0) { s.unmarshalSkipVarSub(t); break; }
				int k = (t >> 3) & 7; t &= 7;
				for(int n = s.unmarshalUInt(); n > 0; --n)
					this.v18.put(s.unmarshalOctetsKV(k), s.unmarshalBeanKV(new TestBean(), t));
			} break;
			case 19: s.unmarshalBean(this.v19, t); break;
			default: s.unmarshalSkipVar(t);
		}}
	}

	@Override
	public TestType clone()
	{
		return new TestType(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19);
	}

	@Override
	public int hashCode()
	{
		int h = 2 * 0x9e3779b1;
		h = h * 31 + 1 + (this.v1 ? 0xcafebabe : 0xdeadbeef);
		h = h * 31 + 1 + this.v2;
		h = h * 31 + 1 + this.v3;
		h = h * 31 + 1 + this.v4;
		h = h * 31 + 1 + (int)this.v5;
		h = h * 31 + 1 + Float.floatToRawIntBits(this.v6);
		h = h * 31 + 1 + (int)Double.doubleToRawLongBits(this.v7);
		h = h * 31 + 1 + this.v8.hashCode();
		h = h * 31 + 1 + this.v9.hashCode();
		h = h * 31 + 1 + this.v10.hashCode();
		h = h * 31 + 1 + this.v11.hashCode();
		h = h * 31 + 1 + this.v12.hashCode();
		h = h * 31 + 1 + this.v13.hashCode();
		h = h * 31 + 1 + this.v14.hashCode();
		h = h * 31 + 1 + this.v15.hashCode();
		h = h * 31 + 1 + this.v16.hashCode();
		h = h * 31 + 1 + this.v17.hashCode();
		h = h * 31 + 1 + this.v18.hashCode();
		h = h * 31 + 1 + this.v19.hashCode();
		return h;
	}

	@Override
	public boolean equals(Object o)
	{
		if(o == this) return true;
		if(!(o instanceof TestType)) return false;
		TestType b = (TestType)o;
		if(this.v1 != b.v1) return false;
		if(this.v2 != b.v2) return false;
		if(this.v3 != b.v3) return false;
		if(this.v4 != b.v4) return false;
		if(this.v5 != b.v5) return false;
		if(this.v6 != b.v6) return false;
		if(this.v7 != b.v7) return false;
		if(!this.v8.equals(b.v8)) return false;
		if(!this.v9.equals(b.v9)) return false;
		if(!this.v10.equals(b.v10)) return false;
		if(!this.v11.equals(b.v11)) return false;
		if(!this.v12.equals(b.v12)) return false;
		if(!this.v13.equals(b.v13)) return false;
		if(!this.v14.equals(b.v14)) return false;
		if(!this.v15.equals(b.v15)) return false;
		if(!this.v16.equals(b.v16)) return false;
		if(!this.v17.equals(b.v17)) return false;
		if(!this.v18.equals(b.v18)) return false;
		if(!this.v19.equals(b.v19)) return false;
		return getClass() == o.getClass();
	}

	@Override
	public int compareTo(TestType b)
	{
		if(b == this) return 0;
		if(b == null) return 1;
		int c;
		c = (this.v1 == b.v1 ? 0 : (this.v1 ? 1 : -1)); if(c != 0) return c;
		c = this.v2 - b.v2; if(c != 0) return c;
		c = this.v3 - b.v3; if(c != 0) return c;
		c = this.v4 - b.v4; if(c != 0) return c;
		c = Long.signum(this.v5 - b.v5); if(c != 0) return c;
		c = Float.compare(this.v6, b.v6); if(c != 0) return c;
		c = Double.compare(this.v7, b.v7); if(c != 0) return c;
		c = this.v8.compareTo(b.v8); if(c != 0) return c;
		c = this.v9.compareTo(b.v9); if(c != 0) return c;
		c = Util.compareTo(this.v10, b.v10); if(c != 0) return c;
		c = Util.compareTo(this.v11, b.v11); if(c != 0) return c;
		c = Util.compareTo(this.v12, b.v12); if(c != 0) return c;
		c = Util.compareTo(this.v13, b.v13); if(c != 0) return c;
		c = Util.compareTo(this.v14, b.v14); if(c != 0) return c;
		c = Util.compareTo(this.v15, b.v15); if(c != 0) return c;
		c = Util.compareTo(this.v16, b.v16); if(c != 0) return c;
		c = Util.compareTo(this.v17, b.v17); if(c != 0) return c;
		c = Util.compareTo(this.v18, b.v18); if(c != 0) return c;
		c = this.v19.compareTo(b.v19); if(c != 0) return c;
		return 0;
	}

	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder(16 + 256 * 2).append('{');
		s.append(this.v1).append(',');
		s.append(this.v2).append(',');
		s.append(this.v3).append(',');
		s.append(this.v4).append(',');
		s.append(this.v5).append(',');
		s.append(this.v6).append(',');
		s.append(this.v7).append(',');
		s.append(this.v8).append(',');
		s.append(this.v9).append(',');
		Util.append(s, this.v10);
		Util.append(s, this.v11);
		Util.append(s, this.v12);
		Util.append(s, this.v13);
		Util.append(s, this.v14);
		Util.append(s, this.v15);
		Util.append(s, this.v16);
		Util.append(s, this.v17);
		Util.append(s, this.v18);
		s.append(this.v19).append(',');
		s.setLength(s.length() - 1);
		return s.append('}').toString();
	}

	@Override
	public StringBuilder toJson(StringBuilder s)
	{
		if(s == null) s = new StringBuilder(1024);
		s.append('{');
		s.append("\"v1\":").append(this.v1).append(',');
		s.append("\"v2\":").append(this.v2).append(',');
		s.append("\"v3\":").append(this.v3).append(',');
		s.append("\"v4\":").append(this.v4).append(',');
		s.append("\"v5\":").append(this.v5).append(',');
		s.append("\"v6\":").append(this.v6).append(',');
		s.append("\"v7\":").append(this.v7).append(',');
		this.v8.dumpJStr(s.append("\"v8\":")).append(',');
		Util.toJStr(s.append("\"v9\":"), this.v9).append(',');
		Util.appendJson(s.append("\"v10\":"), this.v10);
		Util.appendJson(s.append("\"v11\":"), this.v11);
		Util.appendJson(s.append("\"v12\":"), this.v12);
		Util.appendJson(s.append("\"v13\":"), this.v13);
		Util.appendJson(s.append("\"v14\":"), this.v14);
		Util.appendJson(s.append("\"v15\":"), this.v15);
		Util.appendJson(s.append("\"v16\":"), this.v16);
		Util.appendJson(s.append("\"v17\":"), this.v17);
		Util.appendJson(s.append("\"v18\":"), this.v18);
		this.v19.toJson(s.append("\"v19\":")).append(',');
		s.setLength(s.length() - 1);
		return s.append('}');
	}

	@Override
	public StringBuilder toLua(StringBuilder s)
	{
		if(s == null) s = new StringBuilder(1024);
		s.append('{');
		s.append("v1=").append(this.v1).append(',');
		s.append("v2=").append(this.v2).append(',');
		s.append("v3=").append(this.v3).append(',');
		s.append("v4=").append(this.v4).append(',');
		s.append("v5=").append(this.v5).append(',');
		s.append("v6=").append(this.v6).append(',');
		s.append("v7=").append(this.v7).append(',');
		this.v8.dumpJStr(s.append("v8=")).append(',');
		Util.toJStr(s.append("v9="), this.v9).append(',');
		Util.appendLua(s.append("v10="), this.v10);
		Util.appendLua(s.append("v11="), this.v11);
		Util.appendLua(s.append("v12="), this.v12);
		Util.appendLua(s.append("v13="), this.v13);
		Util.appendLua(s.append("v14="), this.v14);
		Util.appendLua(s.append("v15="), this.v15);
		Util.appendLua(s.append("v16="), this.v16);
		Util.appendLua(s.append("v17="), this.v17);
		Util.appendLua(s.append("v18="), this.v18);
		this.v19.toLua(s.append("v19=")).append(',');
		s.setLength(s.length() - 1);
		return s.append('}');
	}
}