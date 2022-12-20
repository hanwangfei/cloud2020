package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 手写ribbon轮询算法
 */
public interface LoadBalance {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
