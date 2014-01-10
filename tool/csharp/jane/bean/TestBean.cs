// This file is generated by genbeans tool. Do NOT edit it!
using System;
using System.Text;
using System.Collections.Generic;

namespace jane.bean
{
	/**
	 * bean的注释
	 */
	public sealed class TestBean : Bean, IComparable<TestBean>
	{
		public const int BEAN_TYPE = 1;
		public const int TEST_CONST1 = 5; // 测试类静态常量
		public const string TEST_CONST2 = "test_const2";

		public  /* 1*/ int value1; // 字段的注释
		public  /* 2*/ long value2;

		public TestBean()
		{
		}

		public TestBean(int value1, long value2)
		{
			this.value1 = value1;
			this.value2 = value2;
		}

		public override void reset()
		{
			value1 = 0;
			value2 = 0;
		}

		public void assign(TestBean b)
		{
			if(b == null) { reset(); return; }
			this.value1 = b.value1;
			this.value2 = b.value2;
		}

		public int getValue1()
		{
			return value1;
		}

		public void setValue1(int value1)
		{
			this.value1 = value1;
		}

		public long getValue2()
		{
			return value2;
		}

		public void setValue2(long value2)
		{
			this.value2 = value2;
		}

		public override int type()
		{
			return 1;
		}

		public override int initSize()
		{
			return 16;
		}

		public override int maxSize()
		{
			return 16;
		}

		public override Bean create()
		{
			return new TestBean();
		}

		public override OctetsStream marshal(OctetsStream s)
		{
			if(this.value1 != 0) s.marshal1((byte)0x04).marshal(this.value1);
			if(this.value2 != 0) s.marshal1((byte)0x08).marshal(this.value2);
			return s.marshal1((byte)0);
		}

		public override OctetsStream unmarshal(OctetsStream s)
		{
			for(;;) { int i = s.unmarshalByte() & 0xff, t = i & 3; switch(i >> 2)
			{
				case 0: return s;
				case 1: this.value1 = s.unmarshalInt(t); break;
				case 2: this.value2 = s.unmarshalLong(t); break;
				default: s.unmarshalSkipVar(t); break;
			}}
		}

		public override object Clone()
		{
			return new TestBean(value1, value2);
		}

		public override int GetHashCode()
		{
			int h = unchecked(1 * (int)0x9e3779b1);
			h = h * 31 + 1 + this.value1;
			h = h * 31 + 1 + (int)this.value2;
			return h;
		}

		public override bool Equals(object o)
		{
			if(o == this) return true;
			if(!(o is TestBean)) return false;
			TestBean b = (TestBean)o;
			if(this.value1 != b.value1) return false;
			if(this.value2 != b.value2) return false;
			return true;
		}

		public int CompareTo(TestBean b)
		{
			if(b == this) return 0;
			if(b == null) return 1;
			int c;
			c = this.value1 - b.value1; if(c != 0) return c;
			c = Math.Sign(this.value2 - b.value2); if(c != 0) return c;
			return 0;
		}

		public override string ToString()
		{
			StringBuilder s = new StringBuilder(16 + 16 * 2).Append('{');
			s.Append(this.value1).Append(',');
			s.Append(this.value2).Append(',');
			s[s.Length - 1] = '}';
			return s.ToString();
		}

		public override StringBuilder toJson(StringBuilder s)
		{
			if(s == null) s = new StringBuilder(1024);
			s.Append('{');
			s.Append("\"value1\":").Append(this.value1).Append(',');
			s.Append("\"value2\":").Append(this.value2).Append(',');
			s[s.Length - 1] = '}';
			return s;
		}

		public override StringBuilder toLua(StringBuilder s)
		{
			if(s == null) s = new StringBuilder(1024);
			s.Append('{');
			s.Append("value1=").Append(this.value1).Append(',');
			s.Append("value2=").Append(this.value2).Append(',');
			s[s.Length - 1] = '}';
			return s;
		}
	}
}
