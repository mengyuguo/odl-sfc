/*
* Generated file
*
* Generated from: yang module name: sfc-netconf-impl yang module local name: sfc-netconf-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Dec 17 19:23:09 CST 2016
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.config.sfc_netconf.impl;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(namespace = "urn:opendaylight:params:xml:ns:yang:controller:config:sfc-netconf:impl", name = "sfc-netconf-impl", revision = "2014-10-20")

public abstract class AbstractSfcNetconfModule extends org.opendaylight.controller.config.spi.AbstractModule<AbstractSfcNetconfModule> implements org.opendaylight.controller.config.yang.config.sfc_netconf.impl.SfcNetconfModuleMXBean {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.config.sfc_netconf.impl.AbstractSfcNetconfModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute dataBrokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DataBroker");
    private javax.management.ObjectName dataBroker; // optional

    public static final org.opendaylight.controller.config.api.JmxAttribute bindingRegistryJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("BindingRegistry");
    private javax.management.ObjectName bindingRegistry; // mandatory

    //attributes end

    public AbstractSfcNetconfModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public AbstractSfcNetconfModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractSfcNetconfModule oldModule,java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void validate() {
        if(dataBroker != null) {
            dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.DataBrokerServiceInterface.class, dataBroker, dataBrokerJmxAttribute);
        }
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.BindingAwareBrokerServiceInterface.class, bindingRegistry, bindingRegistryJmxAttribute);

        customValidation();
    }

    protected void customValidation() {
    }

    private org.opendaylight.controller.md.sal.binding.api.DataBroker dataBrokerDependency;
    protected final org.opendaylight.controller.md.sal.binding.api.DataBroker getDataBrokerDependency(){
        return dataBrokerDependency;
    }private org.opendaylight.controller.sal.binding.api.BindingAwareBroker bindingRegistryDependency;
    protected final org.opendaylight.controller.sal.binding.api.BindingAwareBroker getBindingRegistryDependency(){
        return bindingRegistryDependency;
    }

    protected final void resolveDependencies() {
        if (dataBroker!=null) {
            dataBrokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.md.sal.binding.api.DataBroker.class, dataBroker, dataBrokerJmxAttribute);
        }
        bindingRegistryDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.binding.api.BindingAwareBroker.class, bindingRegistry, bindingRegistryJmxAttribute);
    }

    public boolean canReuseInstance(AbstractSfcNetconfModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractSfcNetconfModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (!java.util.Objects.deepEquals(dataBroker, other.dataBroker)) {
            return false;
        }
        if(dataBroker!= null) {
            if (!dependencyResolver.canReuseDependency(dataBroker, dataBrokerJmxAttribute)) { // reference to dependency must be reusable as well
                return false;
            }
        }
        if (!java.util.Objects.deepEquals(bindingRegistry, other.bindingRegistry)) {
            return false;
        }
        if(bindingRegistry!= null) {
            if (!dependencyResolver.canReuseDependency(bindingRegistry, bindingRegistryJmxAttribute)) { // reference to dependency must be reusable as well
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) { return true; }
    if (o == null || getClass() != o.getClass()) { return false; }
        AbstractSfcNetconfModule that = (AbstractSfcNetconfModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public javax.management.ObjectName getDataBroker() {
        return dataBroker;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.DataBrokerServiceInterface.class)
    public void setDataBroker(javax.management.ObjectName dataBroker) {
        this.dataBroker = dataBroker;
    }

    @Override
    public javax.management.ObjectName getBindingRegistry() {
        return bindingRegistry;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.BindingAwareBrokerServiceInterface.class)
    public void setBindingRegistry(javax.management.ObjectName bindingRegistry) {
        this.bindingRegistry = bindingRegistry;
    }

    public org.slf4j.Logger getLogger() {
        return LOGGER;
    }

}
