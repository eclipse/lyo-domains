// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *	   Sam Padgett	       - initial API and implementation
 *     Michael Fiedler     - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.eclipse.lyo.oslc.domains.qm;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

import org.eclipse.lyo.oslc.domains.qm.Oslc_qmDomainConstants;
import org.eclipse.lyo.oslc.domains.cm.Oslc_cmDomainConstants;
import org.eclipse.lyo.oslc.domains.DctermsDomainConstants;
import org.eclipse.lyo.oslc.domains.FoafDomainConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcDomainConstants;
import org.eclipse.lyo.oslc.domains.qm.Oslc_qmDomainConstants;
import org.eclipse.lyo.oslc.domains.RdfDomainConstants;
import org.eclipse.lyo.oslc.domains.cm.IChangeRequest;
import org.eclipse.lyo.oslc.domains.IPerson;
import org.eclipse.lyo.oslc.domains.IPerson;
import org.eclipse.lyo.oslc.domains.cm.IChangeRequest;
import org.eclipse.lyo.oslc.domains.qm.ITestPlan;
import org.eclipse.lyo.oslc.domains.qm.ITestCase;

// Start of user code imports
// End of user code

@OslcNamespace(Oslc_qmDomainConstants.TESTEXECUTIONRECORD_NAMESPACE)
@OslcName(Oslc_qmDomainConstants.TESTEXECUTIONRECORD_LOCALNAME)
@OslcResourceShape(title = "TestExecutionRecord Resource Shape", describes = Oslc_qmDomainConstants.TESTEXECUTIONRECORD_TYPE)
public interface ITestExecutionRecord
{

    public void addContributor(final Link contributor );
    public void addCreator(final Link creator );
    public void addType(final Link type );
    public void addServiceProvider(final URI serviceProvider );
    public void addBlockedByChangeRequest(final Link blockedByChangeRequest );
    public void addRelatedChangeRequest(final Link relatedChangeRequest );

    @OslcName("contributor")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "contributor")
    @OslcDescription("Contributor or contributors to the resource. It is likely that the target resource will be a foaf:Person but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({FoafDomainConstants.PERSON_TYPE})
    @OslcReadOnly(false)
    public HashSet<Link> getContributor();

    @OslcName("created")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "created")
    @OslcDescription("Timestamp of resource creation")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getCreated();

    @OslcName("creator")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "creator")
    @OslcDescription("Creator or creators of the resource. It is likely that the target resource will be a foaf:Person but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({FoafDomainConstants.PERSON_TYPE})
    @OslcReadOnly(false)
    public HashSet<Link> getCreator();

    @OslcName("identifier")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "identifier")
    @OslcDescription("A unique identifier for a resource. Typically read-only and assigned by the service provider when a resource is created. Not typically intended for end-user display.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getIdentifier();

    @OslcName("modified")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "modified")
    @OslcDescription("Timestamp of latest resource modification")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getModified();

    @OslcName("type")
    @OslcPropertyDefinition(RdfDomainConstants.RDF_NAMSPACE + "type")
    @OslcDescription("The resource type URIs")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcReadOnly(false)
    public HashSet<Link> getType();

    @OslcName("instanceShape")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "instanceShape")
    @OslcDescription("The URI of a Resource Shape that describes the possible properties, occurrence, value types, allowed values and labels. This shape information is useful in displaying the subject resource as well as guiding clients in performing modifications. Instance shapes may be specific to the authenticated user associated with the request that retrieved the resource, the current state of the resource and other factors and thus should not be cached.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcReadOnly(false)
    public URI getInstanceShape();

    @OslcName("serviceProvider")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "serviceProvider")
    @OslcDescription("A link to the resource's OSLC Service Provider. There may be cases when the subject resource is available from a service provider that implements multiple domain specifications, which could result in multiple values for this property.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcReadOnly(false)
    public HashSet<URI> getServiceProvider();

    @OslcName("title")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "title")
    @OslcDescription("Title of the resource represented as rich text in XHTML content. SHOULD include only content that is valid inside an XHTML <span> element.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getTitle();

    @OslcName("blockedByChangeRequest")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "blockedByChangeRequest")
    @OslcDescription("Change Request that prevents execution of the Test Execution Record. It is likely that the target resource will be an oslc_cm:ChangeRequest but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRepresentation(Representation.Reference)
    @OslcRange({Oslc_cmDomainConstants.CHANGEREQUEST_TYPE})
    @OslcReadOnly(false)
    public HashSet<Link> getBlockedByChangeRequest();

    @OslcName("relatedChangeRequest")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "relatedChangeRequest")
    @OslcDescription("A related change request. It is likely that the target resource will be an oslc_cm:ChangeRequest but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRepresentation(Representation.Reference)
    @OslcRange({Oslc_cmDomainConstants.CHANGEREQUEST_TYPE})
    @OslcReadOnly(false)
    public HashSet<Link> getRelatedChangeRequest();

    @OslcName("reportsOnTestPlan")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "reportsOnTestPlan")
    @OslcDescription("Test Plan that the Test Execution Record reports on. It is likely that the target resource will be an oslc_qm:TestPlan but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_qmDomainConstants.TESTPLAN_TYPE})
    @OslcReadOnly(false)
    public Link getReportsOnTestPlan();

    @OslcName("runsOnTestEnvironment")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "runsOnTestEnvironment")
    @OslcDescription("Indicates the environment details of the test case for this execution record.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRepresentation(Representation.Reference)
    @OslcReadOnly(false)
    public Link getRunsOnTestEnvironment();

    @OslcName("runsTestCase")
    @OslcPropertyDefinition(Oslc_qmDomainConstants.QUALITY_MANAGEMENT_NAMSPACE + "runsTestCase")
    @OslcDescription("Test Case run by the Test Execution Record. It is likely that the target resource will be an oslc_qm:TestCase but that is not necessarily the case.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_qmDomainConstants.TESTCASE_TYPE})
    @OslcReadOnly(false)
    public Link getRunsTestCase();


    public void setContributor(final HashSet<Link> contributor );
    public void setCreated(final Date created );
    public void setCreator(final HashSet<Link> creator );
    public void setIdentifier(final String identifier );
    public void setModified(final Date modified );
    public void setType(final HashSet<Link> type );
    public void setInstanceShape(final URI instanceShape );
    public void setServiceProvider(final HashSet<URI> serviceProvider );
    public void setTitle(final String title );
    public void setBlockedByChangeRequest(final HashSet<Link> blockedByChangeRequest );
    public void setRelatedChangeRequest(final HashSet<Link> relatedChangeRequest );
    public void setReportsOnTestPlan(final Link reportsOnTestPlan );
    public void setRunsOnTestEnvironment(final Link runsOnTestEnvironment );
    public void setRunsTestCase(final Link runsTestCase );
}

