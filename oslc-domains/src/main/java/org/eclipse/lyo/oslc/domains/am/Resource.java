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
 *       Sam Padgett          - initial API and implementation
 *     Michael Fiedler      - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.eclipse.lyo.oslc.domains.am;

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

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
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
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import org.eclipse.lyo.oslc.domains.am.Oslc_amDomainConstants;


import org.eclipse.lyo.oslc.domains.DctermsDomainConstants;
import org.eclipse.lyo.oslc.domains.FoafDomainConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcDomainConstants;
import org.eclipse.lyo.oslc.domains.Person;
import org.eclipse.lyo.oslc.domains.Person;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(Oslc_amDomainConstants.RESOURCE_NAMESPACE)
@OslcName(Oslc_amDomainConstants.RESOURCE_LOCALNAME)
@OslcResourceShape(title = "Resource Resource Shape", describes = Oslc_amDomainConstants.RESOURCE_TYPE)
public class Resource
    extends AbstractResource
    implements IResource
{
    // Start of user code attributeAnnotation:contributor
    // End of user code
    private HashSet<Link> contributor = new HashSet<Link>();
    // Start of user code attributeAnnotation:created
    // End of user code
    private Date created;
    // Start of user code attributeAnnotation:creator
    // End of user code
    private HashSet<Link> creator = new HashSet<Link>();
    // Start of user code attributeAnnotation:description
    // End of user code
    private String description;
    // Start of user code attributeAnnotation:identifier
    // End of user code
    private String identifier;
    // Start of user code attributeAnnotation:modified
    // End of user code
    private Date modified;
    // Start of user code attributeAnnotation:source
    // End of user code
    private URI source;
    // Start of user code attributeAnnotation:title
    // End of user code
    private String title;
    // Start of user code attributeAnnotation:type
    // End of user code
    private HashSet<String> type = new HashSet<String>();
    // Start of user code attributeAnnotation:instanceShape
    // End of user code
    private URI instanceShape;
    // Start of user code attributeAnnotation:serviceProvider
    // End of user code
    private HashSet<URI> serviceProvider = new HashSet<URI>();
    // Start of user code attributeAnnotation:shortTitle
    // End of user code
    private String shortTitle;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Resource()
           throws URISyntaxException
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Resource(final URI about)
           throws URISyntaxException
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        Oslc_amDomainConstants.RESOURCE_PATH,
        Resource.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local Resource Resource} - update Resource.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = getAbout().toString();
        }
    
        // Start of user code toString_finalize
        // End of user code
    
        return result;
    }
    
    public String toHtml()
    {
        return toHtml(false);
    }
    
    public String toHtml(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toHtml_init
        // End of user code
    
        if (asLocalResource) {
            result = toString(true);
            // Start of user code toHtml_bodyForLocalResource
            // End of user code
        }
        else {
            result = "<a href=\"" + getAbout() + "\" class=\"oslc-resource-link\">" + toString() + "</a>";
        }
    
        // Start of user code toHtml_finalize
        // End of user code
    
        return result;
    }
    
    public void addContributor(final Link contributor)
    {
        this.contributor.add(contributor);
    }
    
    public void addCreator(final Link creator)
    {
        this.creator.add(creator);
    }
    
    public void addType(final String type)
    {
        this.type.add(type);
    }
    
    public void addServiceProvider(final URI serviceProvider)
    {
        this.serviceProvider.add(serviceProvider);
    }
    
    
    // Start of user code getterAnnotation:contributor
    // End of user code
    @OslcName("contributor")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "contributor")
    @OslcDescription("Contributor or contributors to the resource. It is likely that the target resource will be a foaf:Person but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({FoafDomainConstants.PERSON_TYPE})
    @OslcReadOnly(false)
    public HashSet<Link> getContributor()
    {
        // Start of user code getterInit:contributor
        // End of user code
        return contributor;
    }
    
    // Start of user code getterAnnotation:created
    // End of user code
    @OslcName("created")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "created")
    @OslcDescription("Timestamp of resource creation")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getCreated()
    {
        // Start of user code getterInit:created
        // End of user code
        return created;
    }
    
    // Start of user code getterAnnotation:creator
    // End of user code
    @OslcName("creator")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "creator")
    @OslcDescription("Creator or creators of the resource. It is likely that the target resource will be a foaf:Person but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({FoafDomainConstants.PERSON_TYPE})
    @OslcReadOnly(false)
    public HashSet<Link> getCreator()
    {
        // Start of user code getterInit:creator
        // End of user code
        return creator;
    }
    
    // Start of user code getterAnnotation:description
    // End of user code
    @OslcName("description")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "description")
    @OslcDescription("Descriptive text about resource represented as rich text in XHTML content. SHOULD include only content that is valid and suitable inside an XHTML <div> element.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getDescription()
    {
        // Start of user code getterInit:description
        // End of user code
        return description;
    }
    
    // Start of user code getterAnnotation:identifier
    // End of user code
    @OslcName("identifier")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "identifier")
    @OslcDescription("A unique identifier for a resource. Typically read-only and assigned by the service provider when a resource is created. Not typically intended for end-user display.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getIdentifier()
    {
        // Start of user code getterInit:identifier
        // End of user code
        return identifier;
    }
    
    // Start of user code getterAnnotation:modified
    // End of user code
    @OslcName("modified")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "modified")
    @OslcDescription("Timestamp of latest resource modification")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getModified()
    {
        // Start of user code getterInit:modified
        // End of user code
        return modified;
    }
    
    // Start of user code getterAnnotation:source
    // End of user code
    @OslcName("source")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "source")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcReadOnly(false)
    public URI getSource()
    {
        // Start of user code getterInit:source
        // End of user code
        return source;
    }
    
    // Start of user code getterAnnotation:title
    // End of user code
    @OslcName("title")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "title")
    @OslcDescription("Title of the resource represented as rich text in XHTML content. SHOULD include only content that is valid inside an XHTML <span> element.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getTitle()
    {
        // Start of user code getterInit:title
        // End of user code
        return title;
    }
    
    // Start of user code getterAnnotation:type
    // End of user code
    @OslcName("type")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "type")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public HashSet<String> getType()
    {
        // Start of user code getterInit:type
        // End of user code
        return type;
    }
    
    // Start of user code getterAnnotation:instanceShape
    // End of user code
    @OslcName("instanceShape")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "instanceShape")
    @OslcDescription("The URI of a Resource Shape that describes the possible properties, occurrence, value types, allowed values and labels. This shape information is useful in displaying the subject resource as well as guiding clients in performing modifications. Instance shapes may be specific to the authenticated user associated with the request that retrieved the resource, the current state of the resource and other factors and thus should not be cached.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcReadOnly(false)
    public URI getInstanceShape()
    {
        // Start of user code getterInit:instanceShape
        // End of user code
        return instanceShape;
    }
    
    // Start of user code getterAnnotation:serviceProvider
    // End of user code
    @OslcName("serviceProvider")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "serviceProvider")
    @OslcDescription("A link to the resource's OSLC Service Provider. There may be cases when the subject resource is available from a service provider that implements multiple domain specifications, which could result in multiple values for this property.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcReadOnly(false)
    public HashSet<URI> getServiceProvider()
    {
        // Start of user code getterInit:serviceProvider
        // End of user code
        return serviceProvider;
    }
    
    // Start of user code getterAnnotation:shortTitle
    // End of user code
    @OslcName("shortTitle")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "shortTitle")
    @OslcDescription("Shorter form of dcterms:title for the resource represented as rich text in XHTML content. SHOULD include only content that is valid inside an XHTML <span> element.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getShortTitle()
    {
        // Start of user code getterInit:shortTitle
        // End of user code
        return shortTitle;
    }
    
    
    // Start of user code setterAnnotation:contributor
    // End of user code
    public void setContributor(final HashSet<Link> contributor )
    {
        // Start of user code setterInit:contributor
        // End of user code
        this.contributor.clear();
        if (contributor != null)
        {
            this.contributor.addAll(contributor);
        }
    
        // Start of user code setterFinalize:contributor
        // End of user code
    }
    
    // Start of user code setterAnnotation:created
    // End of user code
    public void setCreated(final Date created )
    {
        // Start of user code setterInit:created
        // End of user code
        this.created = created;
    
        // Start of user code setterFinalize:created
        // End of user code
    }
    
    // Start of user code setterAnnotation:creator
    // End of user code
    public void setCreator(final HashSet<Link> creator )
    {
        // Start of user code setterInit:creator
        // End of user code
        this.creator.clear();
        if (creator != null)
        {
            this.creator.addAll(creator);
        }
    
        // Start of user code setterFinalize:creator
        // End of user code
    }
    
    // Start of user code setterAnnotation:description
    // End of user code
    public void setDescription(final String description )
    {
        // Start of user code setterInit:description
        // End of user code
        this.description = description;
    
        // Start of user code setterFinalize:description
        // End of user code
    }
    
    // Start of user code setterAnnotation:identifier
    // End of user code
    public void setIdentifier(final String identifier )
    {
        // Start of user code setterInit:identifier
        // End of user code
        this.identifier = identifier;
    
        // Start of user code setterFinalize:identifier
        // End of user code
    }
    
    // Start of user code setterAnnotation:modified
    // End of user code
    public void setModified(final Date modified )
    {
        // Start of user code setterInit:modified
        // End of user code
        this.modified = modified;
    
        // Start of user code setterFinalize:modified
        // End of user code
    }
    
    // Start of user code setterAnnotation:source
    // End of user code
    public void setSource(final URI source )
    {
        // Start of user code setterInit:source
        // End of user code
        this.source = source;
    
        // Start of user code setterFinalize:source
        // End of user code
    }
    
    // Start of user code setterAnnotation:title
    // End of user code
    public void setTitle(final String title )
    {
        // Start of user code setterInit:title
        // End of user code
        this.title = title;
    
        // Start of user code setterFinalize:title
        // End of user code
    }
    
    // Start of user code setterAnnotation:type
    // End of user code
    public void setType(final HashSet<String> type )
    {
        // Start of user code setterInit:type
        // End of user code
        this.type.clear();
        if (type != null)
        {
            this.type.addAll(type);
        }
    
        // Start of user code setterFinalize:type
        // End of user code
    }
    
    // Start of user code setterAnnotation:instanceShape
    // End of user code
    public void setInstanceShape(final URI instanceShape )
    {
        // Start of user code setterInit:instanceShape
        // End of user code
        this.instanceShape = instanceShape;
    
        // Start of user code setterFinalize:instanceShape
        // End of user code
    }
    
    // Start of user code setterAnnotation:serviceProvider
    // End of user code
    public void setServiceProvider(final HashSet<URI> serviceProvider )
    {
        // Start of user code setterInit:serviceProvider
        // End of user code
        this.serviceProvider.clear();
        if (serviceProvider != null)
        {
            this.serviceProvider.addAll(serviceProvider);
        }
    
        // Start of user code setterFinalize:serviceProvider
        // End of user code
    }
    
    // Start of user code setterAnnotation:shortTitle
    // End of user code
    public void setShortTitle(final String shortTitle )
    {
        // Start of user code setterInit:shortTitle
        // End of user code
        this.shortTitle = shortTitle;
    
        // Start of user code setterFinalize:shortTitle
        // End of user code
    }
    
    
    static public String contributorToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:contributorToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"contributor\">contributor: </LABEL>";
    
        // Start of user code "Mid:contributorToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:contributorToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String createdToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:createdToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"created\">created: </LABEL>";
    
        // Start of user code "Mid:createdToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"created\" type=\"text\" style=\"width: 400px\" id=\"created\" >";
        // Start of user code "Finalize:createdToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String creatorToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:creatorToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"creator\">creator: </LABEL>";
    
        // Start of user code "Mid:creatorToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:creatorToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String descriptionToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:descriptionToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"description\">description: </LABEL>";
    
        // Start of user code "Mid:descriptionToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"description\" type=\"text\" style=\"width: 400px\" id=\"description\" >";
        // Start of user code "Finalize:descriptionToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String identifierToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:identifierToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"identifier\">identifier: </LABEL>";
    
        // Start of user code "Mid:identifierToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"identifier\" type=\"text\" style=\"width: 400px\" id=\"identifier\" >";
        // Start of user code "Finalize:identifierToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String modifiedToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:modifiedToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"modified\">modified: </LABEL>";
    
        // Start of user code "Mid:modifiedToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"modified\" type=\"text\" style=\"width: 400px\" id=\"modified\" >";
        // Start of user code "Finalize:modifiedToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String sourceToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:sourceToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"source\">source: </LABEL>";
    
        // Start of user code "Mid:sourceToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"source\" type=\"text\" style=\"width: 400px\" id=\"source\" >";
        // Start of user code "Finalize:sourceToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String titleToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:titleToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"title\">title: </LABEL>";
    
        // Start of user code "Mid:titleToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"title\" type=\"text\" style=\"width: 400px\" id=\"title\" >";
        // Start of user code "Finalize:titleToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String typeToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:typeToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"type\">type: </LABEL>";
    
        // Start of user code "Mid:typeToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"type\" type=\"text\" style=\"width: 400px\" id=\"type\" >";
        // Start of user code "Finalize:typeToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String instanceShapeToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:instanceShapeToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"instanceShape\">instanceShape: </LABEL>";
    
        // Start of user code "Mid:instanceShapeToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"instanceShape\" type=\"text\" style=\"width: 400px\" id=\"instanceShape\" >";
        // Start of user code "Finalize:instanceShapeToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String serviceProviderToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:serviceProviderToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"serviceProvider\">serviceProvider: </LABEL>";
    
        // Start of user code "Mid:serviceProviderToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"serviceProvider\" type=\"text\" style=\"width: 400px\" id=\"serviceProvider\" >";
        // Start of user code "Finalize:serviceProviderToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String shortTitleToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:shortTitleToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"shortTitle\">shortTitle: </LABEL>";
    
        // Start of user code "Mid:shortTitleToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"shortTitle\" type=\"text\" style=\"width: 400px\" id=\"shortTitle\" >";
        // Start of user code "Finalize:shortTitleToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    
    public String contributorToHtml()
    {
        String s = "";
    
        // Start of user code contributortoHtml_mid
        // End of user code
    
        try {
            s = s + "<ul>";
            for(Link next : contributor) {
                s = s + "<li>";
                s = s + (new Person (next.getValue())).toHtml(false);
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code contributortoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String createdToHtml()
    {
        String s = "";
    
        // Start of user code createdtoHtml_mid
        // End of user code
    
        try {
            if (created == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + created.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code createdtoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String creatorToHtml()
    {
        String s = "";
    
        // Start of user code creatortoHtml_mid
        // End of user code
    
        try {
            s = s + "<ul>";
            for(Link next : creator) {
                s = s + "<li>";
                s = s + (new Person (next.getValue())).toHtml(false);
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code creatortoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String descriptionToHtml()
    {
        String s = "";
    
        // Start of user code descriptiontoHtml_mid
        // End of user code
    
        try {
            if (description == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + description.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code descriptiontoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String identifierToHtml()
    {
        String s = "";
    
        // Start of user code identifiertoHtml_mid
        // End of user code
    
        try {
            if (identifier == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + identifier.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code identifiertoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String modifiedToHtml()
    {
        String s = "";
    
        // Start of user code modifiedtoHtml_mid
        // End of user code
    
        try {
            if (modified == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + modified.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code modifiedtoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String sourceToHtml()
    {
        String s = "";
    
        // Start of user code sourcetoHtml_mid
        // End of user code
    
        try {
            if (source == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + source.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code sourcetoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String titleToHtml()
    {
        String s = "";
    
        // Start of user code titletoHtml_mid
        // End of user code
    
        try {
            if (title == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + title.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code titletoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String typeToHtml()
    {
        String s = "";
    
        // Start of user code typetoHtml_mid
        // End of user code
    
        try {
            s = s + "<ul>";
            Iterator<String> itr = type.iterator();
            while(itr.hasNext()) {
                s = s + "<li>";
                s= s + itr.next().toString();
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code typetoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String instanceShapeToHtml()
    {
        String s = "";
    
        // Start of user code instanceShapetoHtml_mid
        // End of user code
    
        try {
            if (instanceShape == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + instanceShape.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code instanceShapetoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String serviceProviderToHtml()
    {
        String s = "";
    
        // Start of user code serviceProvidertoHtml_mid
        // End of user code
    
        try {
            s = s + "<ul>";
            Iterator<URI> itr = serviceProvider.iterator();
            while(itr.hasNext()) {
                s = s + "<li>";
                s= s + itr.next().toString();
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code serviceProvidertoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String shortTitleToHtml()
    {
        String s = "";
    
        // Start of user code shortTitletoHtml_mid
        // End of user code
    
        try {
            if (shortTitle == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + shortTitle.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code shortTitletoHtml_finalize
        // End of user code
    
        return s;
    }
    
    
}
