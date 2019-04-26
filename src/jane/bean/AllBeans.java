// This file is generated by genbeans tool. DO NOT EDIT! @formatter:off
package jane.bean;

import jane.core.BeanHandler;
import jane.core.map.IntHashMap;

/** 全部handlers的获取(自动生成的静态类) */
public final class AllBeans
{
	private AllBeans() {}

	public static IntHashMap<BeanHandler<?>> getTestClientHandlers()
	{
		return getTestClientHandlers(null);
	}

	public static IntHashMap<BeanHandler<?>> getTestClientHandlers(IntHashMap<BeanHandler<?>> r)
	{
		if (r == null) r = new IntHashMap<>(2 * 2);
		r.put(1, new jane.handler.testclient.TestBeanHandler());
		r.put(2, new jane.handler.testclient.TestTypeHandler());
		return r;
	}

	public static IntHashMap<BeanHandler<?>> getTestServerHandlers()
	{
		return getTestServerHandlers(null);
	}

	public static IntHashMap<BeanHandler<?>> getTestServerHandlers(IntHashMap<BeanHandler<?>> r)
	{
		if (r == null) r = new IntHashMap<>(3 * 2);
		r.put(1, new jane.handler.testserver.TestBeanHandler());
		r.put(2, new jane.handler.testserver.TestTypeHandler());
		r.put(3, new jane.handler.testserver.TestEmptyHandler());
		return r;
	}
}
