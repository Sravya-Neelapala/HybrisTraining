/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2024, 10:14:55 AM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Training;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Trainee}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainee extends GenericItem
{
	/** Qualifier of the <code>Trainee.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Trainee.project</code> attribute **/
	public static final String PROJECT = "project";
	/** Qualifier of the <code>Trainee.doj</code> attribute **/
	public static final String DOJ = "doj";
	/** Qualifier of the <code>Trainee.experience</code> attribute **/
	public static final String EXPERIENCE = "experience";
	/** Qualifier of the <code>Trainee.training</code> attribute **/
	public static final String TRAINING = "training";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAINING's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTrainee> TRAININGHANDLER = new BidirectionalOneToManyHandler<GeneratedTrainee>(
	TrainingCoreConstants.TC.TRAINEE,
	false,
	"training",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(PROJECT, AttributeMode.INITIAL);
		tmp.put(DOJ, AttributeMode.INITIAL);
		tmp.put(EXPERIENCE, AttributeMode.INITIAL);
		tmp.put(TRAINING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAININGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.doj</code> attribute.
	 * @return the doj
	 */
	public Date getDoj(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DOJ);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.doj</code> attribute.
	 * @return the doj
	 */
	public Date getDoj()
	{
		return getDoj( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.doj</code> attribute. 
	 * @param value the doj
	 */
	public void setDoj(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DOJ,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.doj</code> attribute. 
	 * @param value the doj
	 */
	public void setDoj(final Date value)
	{
		setDoj( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.experience</code> attribute.
	 * @return the experience
	 */
	public Integer getExperience(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EXPERIENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.experience</code> attribute.
	 * @return the experience
	 */
	public Integer getExperience()
	{
		return getExperience( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.experience</code> attribute. 
	 * @return the experience
	 */
	public int getExperienceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getExperience( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.experience</code> attribute. 
	 * @return the experience
	 */
	public int getExperienceAsPrimitive()
	{
		return getExperienceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EXPERIENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final Integer value)
	{
		setExperience( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final SessionContext ctx, final int value)
	{
		setExperience( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final int value)
	{
		setExperience( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.project</code> attribute.
	 * @return the project
	 */
	public EnumerationValue getProject(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PROJECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.project</code> attribute.
	 * @return the project
	 */
	public EnumerationValue getProject()
	{
		return getProject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.project</code> attribute. 
	 * @param value the project
	 */
	public void setProject(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PROJECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.project</code> attribute. 
	 * @param value the project
	 */
	public void setProject(final EnumerationValue value)
	{
		setProject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.training</code> attribute.
	 * @return the training
	 */
	public Training getTraining(final SessionContext ctx)
	{
		return (Training)getProperty( ctx, TRAINING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trainee.training</code> attribute.
	 * @return the training
	 */
	public Training getTraining()
	{
		return getTraining( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.training</code> attribute. 
	 * @param value the training
	 */
	public void setTraining(final SessionContext ctx, final Training value)
	{
		TRAININGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trainee.training</code> attribute. 
	 * @param value the training
	 */
	public void setTraining(final Training value)
	{
		setTraining( getSession().getSessionContext(), value );
	}
	
}
